package com.w.java419;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dome {
    public static void main(String[] args) {
        Collection cloneable=new ArrayList();
        System.out.println(cloneable);
        //add（）：添加集合元素
        cloneable.add(12);
        cloneable.add(3.14);
        cloneable.add("陆福听");
        cloneable.add("好好学习");
        System.out.println(cloneable);
        Collection collection=new ArrayList();
        collection.add("好好学习Java");
        System.out.println(collection);
        //addAll（集合）：将给定集合中的所有元素添加到当前集合中
        cloneable.addAll(collection);
        System.out.println(cloneable);
        //clear（）：清除集合中的所有元素
/**        cloneable.clear();
        System.out.println(cloneable);*/
//contains（）：集合中包含有给定的元素
        boolean f1=cloneable.contains("张三");
        System.out.println(f1);
        //isEmpty（）；用于判断集合是否为空
        boolean f2=collection.isEmpty();
        System.out.println(f2);
        //iterator（）：一般用于遍历数组
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
        //remove():用于删除给定元素
        System.out.println(collection);
        collection.remove("好好学习");
        System.out.println(iterator);
    }
}
