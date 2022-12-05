package com.w.java426;

import java.util.*;

/**
 * @author admin
 */
public class ProvincialLinkage {
    List kunming=new ArrayList();
    List sichuan=new ArrayList();
    List shanghai=new ArrayList();
    List beijing=new ArrayList();
    Map provinceCity=new HashMap();

    public void init(){
        kunming.add("五华区");
        kunming.add("西山区");
        kunming.add("官渡区");
        kunming.add("盘龙区");
        provinceCity.put("昆明",kunming);
        sichuan.add("天府新区");
        sichuan.add("经济开发区");
        provinceCity.put("四川",sichuan);
        shanghai.add("浦东区");
        shanghai.add("长宁区");
        shanghai.add("虹桥区");
        shanghai.add("虹口区");
        provinceCity.put("上海",shanghai);
        beijing.add("东城区");
        beijing.add("西城区");
        provinceCity.put("北京",beijing);
    }
    public void show(Scanner scanner){
        init();//初始化集合
        Set set=provinceCity.keySet();//获取省份
        Iterator iterator=set.iterator();
        System.out.println("请输入省份：");
        while (iterator.hasNext()){
            System.out.println("["+iterator.next()+"]");
        }
        System.out.println();
        String province=scanner.next();
        List cities=(List) provinceCity.get(province);
        System.out.println("相关区或市信息如下：");
        for (Object object: cities){
            System.out.println(object+"");
        }
        System.out.println();
        this.show(scanner);//递归
    }

    public static void main(String[] args) {
        ProvincialLinkage provincialLinkage=new ProvincialLinkage();
        Scanner scanner=new Scanner(System.in);
        provincialLinkage.show(scanner);
    }
}
