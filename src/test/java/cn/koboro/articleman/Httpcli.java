package cn.koboro.articleman;

/**
 * @author xdw
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Httpcli {

    public static void main(String[] args) throws IOException {

        String url = "http://1.119.131.131:8079/article/article";
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("cId", "303"));
        list.add(new BasicNameValuePair("context", s1));

        HttpPost post = new HttpPost(url);

        HttpClient httpClient = HttpClients.createDefault();

        //url格式编码
        UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
        post.setEntity(uefEntity);


        HttpResponse httpResponse = httpClient.execute(post);

        HttpEntity entity = httpResponse.getEntity();
        if (null != entity) {
            System.out.println("-------------------------------------------------------");
            System.out.println(EntityUtils.toString(entity));
            System.out.println("-------------------------------------------------------");
        }


    }

    static String s1 = "<p style=\"white-space:normal;text-align:center;\">\n" +
            "  <span style=\"line-height:1.5;font-size:14px;\"><b><span style=\"font-family:宋体;line-height:27px;font-size:18px;color:#9933E5;\">颈椎</span></b><b><span style=\"font-family:宋体;line-height:27px;font-size:18px;color:#9933E5;\">很脆弱，别随便动</span></b></span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"line-height:1.5;font-size:14px;\">各型颈椎病症状基本缓解或呈慢性状态时，可开始医疗体操以促进症状的进一步消除及巩固疗效。症状急性发作期宜局部休息，不宜增加运动刺激。有较明显或进行性脊髓受压症状时禁忌运动，特别是颈椎后仰运动应禁忌。椎动脉型颈椎病时颈部旋转运动宜轻柔缓慢， 幅度要适当控制。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;text-align:center;\">\n" +
            "  <img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170613104446.jpg\" /> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:16px;color:#9933E5;\">运动带来的益处</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">运动能达到其他疗效无法达到的效果，如脊髓型颈椎病患者不宜进行牵引、按摩治疗等治疗。运用体疗，不仅可以改变颈背的症状，而且可以较大程度地改善颈髓压迫产生的四肢无力、肌肉萎缩等症状。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">通过颈部各方向的放松性运动，活跃颈椎区域血液循环，消除淤血水肿，同时牵伸颈部韧带，放松痉挛肌肉，从而减轻症状。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">增强颈部肌肉，增强其对疲劳的耐受能力，改善颈椎的稳定性，从而巩固治疗效果，防止反复发作。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:16px;color:#9933E5;\">合适的运动项目</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <strong><span style=\"font-size:14px;\">1.颈椎操</span></strong> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">预备动作：取坐位，全身放松，颈伸直，双手自然交叉置于大腿上。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">第一节：1——头正位，2——头低下至最大限度，3——抬头回到正位，4——头仰至最大限度，5——恢复头正位。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">第二节：1——头向左转至最大限度，2——向右转至最大限度，4——头恢复正位。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">第三节：1——头正位，2——头向左转，下颌尽量够左肩，3——头回到正位，4——头向右转，下颌尽量够右肩，5——头恢复到正位。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <strong><span style=\"font-size:14px;\">2.颈椎“米”字操</span></strong> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">本套操相当以头为笔头，用颈椎作笔杆，按下述顺序反复书写“米”字，每次书写5~10个“米”字，准备动作同第一套，整套操连续起伏，不分节。具体方法如下：</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">1.先写一横，头尽量由左到右划一横线；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">2.头回到正位；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">3.再写一竖，头尽量向前上方拉伸，自上而下划一竖线；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">4.头回到正位；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">5.头颈尽量向左上方拉伸成45度角，而后斜行划线拉伸至右下45度；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">6.头回到正位；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">7.头颈尽量向右上方拉伸成45度角，而后斜行划线拉伸至左下45度；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">8.头回到正位；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">9.头颈 尽量向右前上方拉伸，向左下方划一撇；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">10.头回到正位；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">11.头颈尽量向左前上方拉伸，向右下方划一捺；</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">12.头恢复正位。以上为一个“米”字。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:16px;color:#9933E5;\">运动养生指导</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;text-align:center;\">\n" +
            "  <span style=\"font-size:16px;color:#9933E5;\"><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170613104252.jpg\" /><br />\n" +
            "</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">在运动时要注意预防颈椎病的动作，应采用运动幅度较小、轻柔缓和、节奏较慢的周期性动力性动作，这样可以达到动静结合，如果长期坚持下去会有良好的效果。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:16px;color:#9933E5;\">运动注意事项</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">在做运动时切不可将头、颈做乌龟捋的乱转乱晃，以免造成不适，损伤颈椎。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <span style=\"font-size:14px;\">对于症状较为严重的患者，运动要十分注意，如果运动时有所不适，则宜停止，或向医生咨询。</span> \n" +
            "</p>\n" +
            "<p style=\"white-space:normal;\">\n" +
            "  <br />\n" +
            "</p>\n" +
            "<p style=\"white-space:normal;text-align:right;\">\n" +
            "  ——摘自 徐林、王海联、徐森《大众运动处方》\n" +
            "</p>\n" +
            "<div>\n" +
            "  <br />\n" +
            "</div>";
}