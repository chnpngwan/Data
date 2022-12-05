package com.w.java8;
/*
 第三题：编写自定义类实现用户信息类。
任务:
用户类:
属性:用户名、密码。
方法:用户信息验证
要求:
1.设计构造函数实现对属性赋值
2.设置私有属性,get/set方法实现对属性的访问
3.用户信息验证判断两个用户信息是否一致。当用户名和密码都一致的时候返回:
用户名和密码一致，否则返回:用户名或密码不一致

 */
public class User {
    private String userName;//用户名
    private String password;//密码
    public User() {
        super();
    }
    public User(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //用户的信息验证方法
    public void checkInfo(String name,String pwd) {
        if(name.equals(userName) && pwd.equals(password)) {
            System.out.println("用户名和密码一致");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
}
