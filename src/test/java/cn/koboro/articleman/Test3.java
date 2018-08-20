package cn.koboro.articleman;

import lombok.Data;
import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xdw
 */
public class Test3 {

    public String s = "<div class=\"form-group\">\n" +
            "                           <label class=\"col-sm-2 control-label form-label\"></label>\n" +
            "                           <div class=\"col-sm-2\">\n" +
            "                               <select class=\"\" name=\"servicesAvailableSelectId\"><option value=\"-1\">请选择</option><option value=\"14\">1111111--1</option><option value=\"15\">111111-2</option><option value=\"16\">22222-22</option><option value=\"17\">2222--223</option><option value=\"18\">项目内容1</option><option value=\"19\">项目内容2</option><option value=\"20\">什么项目内容</option><option value=\"21\">测试项目内容001</option><option value=\"22\">测试项目内容002</option><option value=\"23\">测试项目内容003</option><option value=\"24\">测试项目内容004</option><option value=\"25\">测试项目内容005</option></select>\n" +
            "                           </div>\n" +
            "\n" +
            "                           <label class=\"col-sm-1 control-label form-label\">服务人群上限</label>\n" +
            "                           <div class=\"col-sm-2\">\n" +
            "                               <input type=\"text\" class=\"form-control\">\n" +
            "                           </div>\n" +
            "                           <label class=\"col-sm-1 control-label form-label\">必查</label>\n" +
            "                           <div class=\"radio\" style=\"float:left;padding-right:20px\">\n" +
            "                               <input type=\"radio\" name=\"willCheckName\" id=\"willCheckIdYes\" value=\"option1\">是\n" +
            "                               <label for=\"willCheckIdYes\"></label>\n" +
            "                           </div>\n" +
            "                           <div class=\"radio\" style=\"float:left\">\n" +
            "                               <input type=\"radio\" name=\"willCheckName\" id=\"willCheckIdNo\" value=\"option1\" checked=\"\">否\n" +
            "                               <label for=\"willCheckIdNo\"></label>\n" +
            "                           </div>\n" +
            "                       </div>\n" +
            "                       <div class=\"form-group\">\n" +
            "                           <label class=\"col-sm-2 control-label form-label\"></label>\n" +
            "                           <div class=\"col-sm-8\">\n" +
            "                               <textarea class=\"form-control\" rows=\"3\" style=\"width: 800px;\"></textarea>\n" +
            "                           </div>\n" +
            "                       </div>";

    //    static String regex = "(<input[^>]+id=\")([^\\\"]+)(\"[^>]*>)|(<label[^>]+for=\")([^\\\"]+)(\"[^>]*>)";
    static String regex = "(<input[^>]+id=\")([^\\\"]+)(\"[^>]*>)";
    static String regex2 = "(<label[^>]+for=\")([^\\\"]+)(\"[^>]*>)";

    static Pattern p = Pattern.compile(regex);

    @Test
    public void test() {
        String s1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String aaa = s.replaceAll(regex, "$1$2" + s1 + "$3");
        aaa = aaa.replaceAll(regex2, "$1$2" + s1 + "$3");
//        Matcher matcher = p.matcher(m);
//        while (matcher.find()) {
//            System.out.println(1);
//        }
        System.out.println(aaa);
    }

    @Test
    public void test2() {
        C c = new C();
        c.setId(1);
        c.setName("a");

        C c1 = new C();
        c.setId(1);
        c.setName("b");
        C c2 = new C();
        c.setId(2);
        c.setName("a");
        List list = new ArrayList<>();
        list.add(c);
        list.add(c1);
        list.add(c2);

//        Set<Map> set = new TreeSet<Map>((o1, o2) -> ((Integer) o1.get("1")).compareTo((Integer) o2.get("1")));

        Set<C> set = new TreeSet<>((o1, o2) -> o1.getId().compareTo(o2.getId()));

        Set<C> personSet = new TreeSet<>(Comparator.comparing(C::getId));
        set.addAll(list);
        System.out.println(set);
        System.out.println(personSet);

    }

    @Data
    class C {
        private Integer id;
        private String name;
    }

}
