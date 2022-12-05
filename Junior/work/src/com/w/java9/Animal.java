package com.w.java9;
/*
 第四题
请创建一个Animal动物类，要求有方法eat（）方法，方法输出一条语句“吃东西”。
 创建一个接口A，接口里有一个抽象方法fly（）。创建一个Bird类继承Animal类
 并实现接口A里的方法输出一条有语句“鸟儿飞翔”，重写eat（）方法输出一条语
 句“鸟儿 吃虫”。在Test类中向上转型创建b对象，调用eat方法。然后向下转型调
 用eat（）方 法、fly（）方法。
 */
public class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}
//创建接口
interface A{
    public void fly();//添加抽象方法
}
