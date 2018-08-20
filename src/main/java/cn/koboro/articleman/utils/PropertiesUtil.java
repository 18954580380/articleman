package cn.koboro.articleman.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil {
   //ftp配置文件读取
    public static String getFtpProperties(){
    	return "config/ftp.properties";
    }
    //service配置文件读取
    public static String getServiceProperties(){
    	return "config/service.properties";
    }
	/**
	 * 读取配置文件获取值
	 * @return
	 */
	 public static Map<String,String> getPropertiesValue(String keyName[]) { 
		 Map<String,String>map=new HashMap<>();
         Properties prop = new Properties();       
            try{  
            	ClassLoader classLoader=PropertiesUtil.class.getClassLoader();
                InputStream ism=classLoader.getResourceAsStream(getFtpProperties());
                prop.load(ism);
                for(String k:keyName){
                	if(prop.containsKey(k)){
                		map.put(k, prop.getProperty(k));  
                	}else{
                		map.put(k, null);
                	}
                }
                return map;
            }  
            catch(Exception e){  
            	throw new IllegalAccessError("读取ftp属性文件失败");
            }  
  
    }  
	 /**
	  * 读取Service配置文件获取值
	  * @return
	 * @throws IOException 
	  */
	 public static String getServiceProperties(String key) throws IOException { 
		    Properties properties = new Properties();
		    // 使用ClassLoader加载properties配置文件生成对应的输入流
		    InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream(getServiceProperties());
		    // 使用properties对象加载输入流
		     properties.load(in);
		    //获取key对应的value值
		    return properties.getProperty(key);
	 }
}
