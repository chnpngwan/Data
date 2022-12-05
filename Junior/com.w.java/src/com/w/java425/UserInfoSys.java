package com.w.java425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoSys {
    List list=new ArrayList();
// 添加
    public void addUserInfo(Scanner scanner){
        System.out.println("请输入编号：");
        String no=scanner.next();
        System.out.println("请输入姓名：");
        String name=scanner.next();
        System.out.println("请输入年龄：");
        String sex=scanner.next();
        UserInfo userInfo=new UserInfo();
        userInfo.setNo(no);
        userInfo.setName(name);
        userInfo.setSex(sex);
        list.add(userInfo);
        System.out.println("用户信息添加成功");
    }
//删除
    public void deleteUserInfo(Scanner scanner){
        System.out.println("请输入要删除的编号：");
        String no=scanner.next();
        for (int i=0;i< list.size();i++){
            UserInfo userInfo=(UserInfo) list.get(i);
            if (userInfo.getNo().equals(no)){
                list.remove(no);
            }
        }
        System.out.println("删除成功！");
    }
//查询
    public void selectUserInfo(Scanner scanner){
        System.out.println("【1】按编号查询【2】按姓名查询【3】按性别查询");
        int flag=scanner.nextInt();
        if(1==flag){
            System.out.println("请输入编号：");
            String no=scanner.next();
            for (int i=0;i< list.size();i++){
                UserInfo userInfo=(UserInfo) list.get(i);
                if (userInfo.getNo().equals(no)){
                    System.out.println("查询到的用户信息："+userInfo);
                    break;
                }
            }
//            this.service(scanner);
        }else if (2==flag){
            System.out.println("请输入姓名：");
            String no=scanner.next();
            List userInfoList=new ArrayList();
            for (int i=0;i<list.size();i++){
                UserInfo userInfo1=(UserInfo) list.get(i);
                if (userInfo1.getName().equals(no)){
                    userInfoList.add(userInfo1);
                }
            }
            System.out.println("按姓名查询符合的用户信息："+userInfoList);
//            this.service(scanner);
        }else if (3==flag){
            System.out.println("请输入性别");
            String no=scanner.next();
            List userInfoList=new ArrayList();
            for (int i=0;i< list.size();i++){
                UserInfo userInfo=(UserInfo) list.get(i);
                if (userInfo.getSex().equals(no)){
                    userInfoList.add(userInfo);
                }
            }
            System.out.println("按性别查询符合的用户信息："+userInfoList);
//            this.service(scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请执行操作【1】添加【2】删除【3】查询：");
        int i=scanner.nextInt();
        UserInfoSys userInfoSys=new UserInfoSys();
        userInfoSys.addUserInfo(scanner);
        userInfoSys.deleteUserInfo(scanner);
        userInfoSys.selectUserInfo(scanner);
    }
}
