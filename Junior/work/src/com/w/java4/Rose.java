package com.w.java4;

import java.awt.*;

/**
 * （2）定义一个Rose玫瑰花类继承Flower类
 *  * 玫瑰花自己的属性：产地（要求对产地属性进行封装 私有化属性）
 *  * 重写父类中的显示详细信息的方法showInfo，在重写的showInfo方法中通过super调用父类的showInfo方法；并显示产地信息。
 *  * 再定义一个方法warn警告显示：不要摘玫瑰花，小心扎手！ */
public class Rose extends Flower{
    private String load;

    public Rose(String color, double price) {
        super(color, price);
    }

    public Rose() {

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getColor()+"颜色的花产自"+load+","+getPrice()+"￥");
    }
    public void warn(){
        System.out.println("不要摘玫瑰花，小心扎手！");
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }
}
