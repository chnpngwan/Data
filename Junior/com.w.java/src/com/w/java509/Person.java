package com.w.java509;

/**
 * ClassName:Person
 * PackageName:com.w.java509
 * Description:
 *
 * @date:2022/5/9 19:19
 * @author: Yuancoding
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    private Home home;
    private Person(Home home){

    }
    public static class Home{
        String address;
        String tel;
        public Home(String address,String tel){
        this.address=address;
        this.tel=tel;
    }
        public void shoeInfo(){
            System.out.println("地址:"+address);
            System.out.println("电话:"+tel);
    }
}
public void show(){
    System.out.println(name);}
}
