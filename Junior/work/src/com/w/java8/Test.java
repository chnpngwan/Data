package com.w.java8;

public class Test {
    public static void main(String[] args) {
        User  user = new User("admin","123");
        user.setUserName("jack");
        user.checkInfo("jack", "123");
    }
}
