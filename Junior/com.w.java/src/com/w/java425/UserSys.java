package com.w.java425;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author admin
 */
public class UserSys {
    public Set set=new HashSet();
    public void addUser(Scanner scanner){
        System.out.println("请输入姓名：");
        String name=scanner.next();
        System.out.println("请输入性别：");
        String sex=scanner.next();
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();
        User user=new User();
        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        set.add(user);
        System.out.println("当前用户信息："+set);
        this.addUser(scanner);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UserSys userSys=new UserSys();
        userSys.addUser(scanner);
    }
}
