package com.w.java425;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcResult {
    public static void cale(int count) {
        List dataList = new ArrayList();
        for (int i = 0; i <= count; i++) {
            Person person = new Person();
            person.setNo("PERSON-" + i);
            dataList.add(person);
        }
        int index = 0;
        while (dataList.size() > 1) {
            index++;
            if (index == 3) {
                dataList.remove(0);
                index = 0;
                continue;
            }
            dataList.add(dataList.remove(0));
        }
        System.out.println("最后剩下的一个人编号=" + dataList.get(0));
    }

    public static void main(String[] args) {
        CalcResult calcResult=new CalcResult();
        System.out.println("请输入总人数：");
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        cale(count);
    }
}
