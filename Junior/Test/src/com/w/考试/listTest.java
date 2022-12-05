package com.w.考试;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:listTest
 * PackageName:com.w.考试
 * Description:
 *
 * @date:2022/5/9 10:55
 * @author: Yuancoding
 */
public class listTest {
    public static void main(String[] args) {
        Student student1=new Student("张三1","1998",20);
        Student student2=new Student("张三2","1999",32);
        Student student3=new Student("张三3","1998",18);
        Student student4=new Student("张三4","1998",63);
        Student student5=new Student("张三5","1998",24);
        List<Student> list=new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        for (Object obj:list){
            System.out.println(obj);
        }
        /* List list1=new ArrayList();*/
        list.set(0,"李四");
        list.set(1,"李四");
        list.set(2,"李四");
        list.set(3,"李四");
        list.set(4,"李四");
        for (Object obj:list){
            System.out.println(obj);
        }



        Map map=new HashMap();
        map.put("1998","张三1");
        map.put("1999","张三2");
        map.put("2000","张三3");
        map.put("2001","张三4");
        map.put("2002","张三5");
        for (Object key:map.keySet()){
            Object value=map.get(key);
            System.out.println(key+"-"+value);
        }
    }
}
