package com.w.test;

import java.util.Scanner;

/**
 * @author Dream
 */ //用户登录
public class Test8 {
    public static void main(String[] args) {
        String username="item";
        String password="Uzbek";
        for (int i=0;i<3;i++){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=scanner.nextLine();
        System.out.println("请输入密码：");
        String pwd=scanner.nextLine();
        if (name.equals(username)&&pwd.equals(password)){
            System.out.println("登陆成功");
            break;
        }else {
            if (2-i==0){
                System.out.println("你的账号被锁定，请与管理员联系");
            }
            System.out.println("登陆失败，你还有"+(2-i)+"次机会");
            }
        }
    }
}
