package com.w.idea;

public class name {
        public static void main(String[] args)//随机生成数组下标、
    int num = (int)(Math.random() * 1000);
//对生成的随机数进行判断，如果小于数组下标，就跳出循环
            while (num>name.length-1) {
        if (num<=name.length-1) {
            break;
        }
        num = (int)(Math.random() * 1000);
    }
//将数组下标设置成随机数，就可以实现人名的随机抽取
            System.out.println("被抽到的同学是:"+name[num]);}
}
        {
//定义人名数组
            java.lang.String[] name = {"周建平","宋忠豪","罗婷","孟泽宇","黄阿嘎","周永华","胡金红","吴明忠","李瑞能","秦杰",
                    "张杰斌","王锦伟","李曼","陆福听","王湘楠","李永凤","代明笛","孟娅雪","项正康","王春平",
                    "朱凡吉","赵文梅","尹申正","李司宇","李梦瑶","何明涛","张伟萍","李倩","马佳居","田志强",
                    "吴佳凌","罗校国","杨树清","罗智豪","廖宇","马昊天","郑星","蔡溪","黑恒川","陈娥",
            };
