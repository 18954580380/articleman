package cn.koboro.articleman;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xdw
 */
public class Test2 {

    //    public static final Pattern p = Pattern.compile("\\$\\{([^}]*)\\}");
//    public static final Pattern p = Pattern.compile("<img src=\"([^http]*)\" />");
//    public static final Pattern p = Pattern.compile("<img src=\"(((?!http).)*)\" />");
    public static final Pattern p = Pattern.compile("(<img\\s+src=\")(((?!http|\\\").)*)(\"\\s+/>)");

    @Test
    public void test3() {
        String m = " <img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170524100557.jpeg\" />   <img src=\"http://bb/systemassert/healthEducation-showPic.htm?pictureSrc=/20170524100557.jpeg\" />  <img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170524100557.jpeg\" />  ";
        String s = " http://aaa";
        Matcher matcher = p.matcher(m);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            System.out.println(matcher.group(0) + " ---> " + s);
            String temp = matcher.group(0);
            System.out.println("1: " + matcher.group(1));
            System.out.println("2: " + matcher.group(2));
            System.out.println("3: " + matcher.group(3));
            System.out.println(temp.replaceAll(temp, "$1" + s + "$2$3"));
            String s1 = temp.replaceAll(matcher.group(1), s + matcher.group(1));
            matcher.appendReplacement(sb, s1);
        }
        if (sb.length() > 0) {
            matcher.appendTail(sb);
        }

        System.out.println(sb);
    }

    @Test
    public void test4() {
        String m = " <img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/asdasdasd.jpeg\" />   <img src=\"http://bb/systemassert/healthEducation-showPic.htm?pictureSrc=/20170524100557.jpeg\" />  <img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/123123123.jpeg\" />  ";
        String s = " http://aaa";
        String aaa = s1.replaceAll("(<img\\s+src=\")(((?!http|\\\").)*)(\"\\s+/>)", "$1" + s + "$2$4");
        Matcher matcher = p.matcher(m);
        while (matcher.find()) {
            System.out.println(1);
        }
        System.out.println(aaa);
    }

    String s1 = "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:18px;color:#337FE5;\"><strong>瘦人也会得脂肪肝？你怎么看</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">近些年人们越来越注重养生，但在上班族中有一种肝病越来越流行！如此放肆，想必人们对TA未必是真的了解啦。 </span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">TA就是脂肪肝。以前说起脂肪肝，小编脑子里最先浮现的画面就是↓↓↓</span> \n" +
            "</p>\n" +
            "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:14px;\"><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170516094120.png\" /><br />\n" +
            "</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">这种大腹便便，看上去应酬多，经常大量喝酒、大口吃肉的人似乎才是脂肪肝的偏爱。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">但是，不久前小编身边的一位瘦成A4腰的小仙女在体检中，也被查出了脂肪肝，这让小编开始刷新自己的健康观了：脂肪肝并非胖人专属？那瘦子为啥也会中枪呢？脂肪肝还有哪些常见的误区？......</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">带着疑问，小编找到了医学专家程医生，请程医生详细讲解了脂肪肝的常见误区。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区一：只有胖人才会患脂肪肝</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">脂肪肝听起来好像是胖人的专利，因为胖人脂肪多，所以啊......但事实上瘦人身体也可能会藏着脂肪肝。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">一些节食或偏食的瘦人，由于蛋白质供应水平低下或者吸收不良，引起人体内的白蛋白合成减少，促使脂肪分解和动用，使大量脂肪酸从脂肪组织中释放进入肝脏，导致肝内脂肪积蓄，形成营养不良性脂肪肝。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：瘦人得脂肪肝根源在营养失衡，该吃的不吃就会导致肝功能的异常，无论是减肥还是节食都要明确一点：「不管做什么，拿健康做代价肯定是得不偿失。」</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区二：脂肪肝仅仅是肝脏疾病</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">可不要小瞧脂肪肝，它背后可能会有很多让人害怕的“大佬”。</span> \n" +
            "</p>\n" +
            "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:14px;\"><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170516094138.png\" /><br />\n" +
            "</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">肝脏是人体内的化工厂，也是最重要的代谢的排毒器官。引起脂肪肝的原因很多，常见的有肥胖、过量饮酒、高脂血症、糖尿病、慢性肝病及中老年内分泌疾病等。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">「唇齿相依」说的就是这个道理吧。</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：如果发现脂肪肝，除了检查肝功能外，大家还需要进行血压、血脂、血糖等方面的检查。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区三：无症状脂肪肝不需要治</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">肝脏内没有神经支配，只有肝脏包膜上存在感觉神经。所以只有肝脏细胞中的脂肪堆积到一定程度，包膜受到牵拉时，人才会感觉到才会出现肝区胀痛、隐痛等不适感。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">大多数脂肪肝患者不出现肝病的自觉症状，甚至发展成脂肪性肝炎或早期肝硬化还未出现明显症状。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">如果发现脂肪肝后不当回事儿，那真是把自己往火坑地推啊...</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：脂肪肝的治疗应趁早，与有无症状无关。早期轻度脂肪肝通过生活方式的改变，饮食结构调整及适当运动完全可以恢复正常。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区四：脂肪肝治疗需服用药</strong></span> \n" +
            "</p>\n" +
            "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:14px;\"><strong><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170516094152.png\" /><br />\n" +
            "</strong></span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">保肝药物只在肝功能有明显异常时酌情使用，而降脂药物是否可以治疗脂肪肝还存在争议。是药三分毒，多数药物的代谢都在肝脏里，滥用可能会加重肝损伤。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：脂肪肝最安全也最基本的治疗是改变生活方式，调整饮食结构，少坐多动。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区五：脂肪肝患者需禁食脂肪</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">造成脂肪肝的原因有多种，有的是因营养不良引起的，所以不能一概强调饮食控制。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">即使是肥胖性、营养过剩性脂肪肝，也不能靠“一点荤腥都不沾”的方法来治疗，偏食引起的营养不良会产生一系列的其他疾病。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：脂肪肝患者要注意低脂饮食，并供给充足的蛋白质（建议每天在70克以上，其中动物学蛋白质与植物学蛋白质各占一半，同时增加大豆类蛋白的摄入）。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区六：脂肪肝患者要多吃水果</strong></span> \n" +
            "</p>\n" +
            "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:14px;\"><strong><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170516094205.png\" /><br />\n" +
            "</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">许多人认为：得个脂肪肝这不能吃，那要限制的，好麻烦啊，还是多吃万能的水果来调节一下压压惊吧！</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">这个......多吃水果也是不可以的。水果中脂肪含量低不错，但是糖分较高，过多进食，可能扰乱糖代谢，过多的糖类在体内可以转换为脂肪，到最后脂肪肝不但没有好转反而更严重了。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">还是多担待一下自己的脂肪肝，不乱吃才为上上策。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：脂肪肝患者能否吃水果、吃什么种类的水果、吃多少、怎么吃，应根据具体情况而定。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>误区七：脂肪肝不可逆</strong></span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">无论是什么原因引起的脂肪肝，其早期都是一种可逆性病变。此时如果自律以及高度自律，实施强有力的干预，并持之以恒，就有可能使细胞内沉积的脂肪逐渐减少至正常，那时就可以享受自律带给自己的自由了！</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">注意是早期，如果早期没能打败脂肪肝，那后期只能任它折腾了...</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">专家建议：患者病因不同，调养原则不同：肥胖、高血脂症、糖尿病所致营养过剩性脂肪肝患者，要严格控制总热量和脂肪的摄入；酒精性脂肪肝，戒酒是最重要的。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:16px;color:#337FE5;\">得了脂肪肝怎么办？</span>\n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">最重要的是少喝酒。</span> \n" +
            "</p>\n" +
            "<p style=\"text-align:center;\">\n" +
            "  <span style=\"font-size:14px;\"><img src=\"/systemassert/healthEducation-showPic.htm?pictureSrc=/20170516094247.png\" /><br />\n" +
            "</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>「管住嘴」。</strong>坚持“植物性食物为主，动物性食物为辅，热量来源以粮食为主”。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\">不仅要吃三餐，还要做到尽可能定时定量。改掉吃夜宵，晚餐大鱼大肉以及把含糖饮料当水喝等不良习惯。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>「迈开腿」。</strong>每周两三次30分钟有氧运动，心率跳动达110次/分，有微喘的状态即可，才可有效得达到健身减脂。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <span style=\"font-size:14px;\"><strong>「慎用药」。</strong>所有药物都有两重性，用药不当极易造成药物性肝损害，所以用药之前一定要遵照医生嘱咐。</span> \n" +
            "</p>\n" +
            "<p>\n" +
            "  <br />\n" +
            "</p>";

}
