package com.w.java425;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDomme1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        Set set=new HashSet();
//        HashSet hashSet=new HashSet();
        set.add("张三");
        System.out.println(set);
        set.add(new String("张三"));
        System.out.println(set);
    }
}
