package com.w.java509;

import java.util.*;

/**
 * ClassName:Tree
 * PackageName:com.w.java509
 * Description:
 *
 * @date:2022/5/9 18:35
 * @author: Yuancoding
 */
public class Tree {
    List<String> china=new ArrayList<String>();
    List<String> usa=new ArrayList<String>();
    Map<String,List<String>> countryMap=new HashMap<String,List<String>>();
    public void init(){
        //中国
        List<String> chinaProvince=new ArrayList<String>();
        chinaProvince.add("上海市");
        chinaProvince.add("北京市");
        chinaProvince.add("天津市");
        chinaProvince.add("山东省");
        chinaProvince.add("湖北省");
        chinaProvince.add("云南省");
        chinaProvince.add("湖南省");
        //美国
        List<String> usaProvince=new ArrayList<String>();
        usaProvince.add("亚拉巴马州");
        usaProvince.add("阿肯色州");
        usaProvince.add("佛罗里达州");
        usaProvince.add("俄亥俄州");
        usaProvince.add("马里兰州");
        usaProvince.add("印第安纳州");
        //将国家及下属国家的直辖市/省/州添加到Map集合里面
        countryMap.put("中国",chinaProvince);
        countryMap.put("美国",usaProvince);
        }

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.init();
        //遍历key值
        Set<String> country=tree.countryMap.keySet();
        for (String country1:country){
            System.out.println(country1);//输出国家
            List<String> cities=tree.countryMap.get(country1);//获取地方信息
            for (String city:cities){
                System.out.println("   "+city);
            }
        }
    }
}
