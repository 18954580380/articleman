package cn.koboro.articleman.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.koboro.articleman.model.ArticlemanEntity;
import cn.koboro.articleman.service.ArticlemanService;
import cn.koboro.articleman.utils.PropertiesUtil;
import cn.koboro.articleman.utils.SftpFile;
import cn.koboro.articleman.vo.ResultVO;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Controller
public class ArticleController {

    @Resource
    private Configuration configuration;
    @Resource
    private ArticlemanService articlemanService;

    /**
     * 添加内容文件同时生成静态页面
     * cid和type两个字段确定一条记录
     * @param request
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/article", method = {RequestMethod.POST, RequestMethod.GET})
    public ResultVO articleAdd(HttpServletRequest request, String context, Long cId,Long type) throws IOException, TemplateException {
          if (cId == null) {
             return ResultVO.error(0, "编号不能为空");
          }
          if (type == null) {
        	  return ResultVO.error(0, "类型不能为空");
          }
          if (StringUtils.isBlank(context)) {
        	  return ResultVO.error(0, "内容不能为空");
          }
          //查询已经存在的上床记录
          List<ArticlemanEntity> articlemanes = articlemanService.findArticlemaneByCidAndType(cId,type);
          String id = UUID.randomUUID().toString();
          //获得保存静态资源路径
          String htmlRealPath = request.getSession().getServletContext().getRealPath("/") + "/freeMarker/";
          //实际部署保存路径
          // String htmlRealPath=contentHtmlLocation;
          System.out.println("保存的绝对路径是:" + htmlRealPath + "/" + id + ".html");
          // 创建文件对象
          File htmlFile = new File(htmlRealPath + "/" + id + ".html");
          //上传到sftp上的文件名称
          String saveUrl="";
          // 判断是否有静态页面文件 若没有
          if (!htmlFile.exists()) {
            // 获得模板对象
            Template template = configuration
                    .getTemplate("article.ftl");

            //先得到文件的上级目录，并创建上级目录，在创建文件
            htmlFile.getParentFile().mkdirs();
            try {
                //创建文件
                htmlFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建map集合
            Map<String, Object> map = new HashMap<>();
            map.put("content", context);
            try( Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(htmlFile), "UTF-8"));) {
            	  // 合并输出 创建页面文件
                 template.process(map, out);
			} catch (Exception e) {
				  return ResultVO.error(0, "模板生成HTML失败");
			}
            //上传到ftp
            saveUrl= uploadMedalInfoImg(htmlFile);
            if(saveUrl==""){
            	 return ResultVO.error(0, "上传失败");
            }
           }
         //获得sftp上传文件信息
         ArticlemanEntity article = new ArticlemanEntity();
         article.setCId(cId);
         article.setType(type);
         article.setContext(context);
         article.setPath(saveUrl);
        //保存当前记录，并删除已经存在的记录
        int count=articlemanService.processingData(article,articlemanes);
        return  count==1?ResultVO.success(article):ResultVO.error(0, "上传失败");
    }
    /**
     * 上传到sftp
     * @param file
     * @return
     */
	public String uploadMedalInfoImg(File file)  {
       String[]keyName=new String[]{"userName","password","host","port","dir",};
       Map<String,String>map;
        try {
        	map=PropertiesUtil.getPropertiesValue(keyName);
        	SftpFile sftpFile=new SftpFile(map.get("userName"),map.get("password"),map.get("host"),Integer.valueOf(map.get("port")));
        	//链接ftp
        	sftpFile.login();
        	sftpFile.upload(map.get("dir").toString()+"article/",file.getPath());
		} catch (Exception e) {
			//图片上传失败
			return "";
		}
        file.delete();
        String saveUrl="/article/"+file.getName();
        return  saveUrl;
    }
}