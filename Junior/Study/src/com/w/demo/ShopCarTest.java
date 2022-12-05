package com.w.demo;

import java.util.Scanner;

/**
 * @author admin
 */
public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true) {
            System.out.println("请您选择如下命令进行操作:");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = scanner.next();
            switch (command) {
                //添加商品到购物车
                case "add":
                    addGoods(shopCar, scanner);
                    break;
                //查询商品到购物车
                case "query":
                    queryGoods(shopCar);
                    break;
                //修改商品购买数量
                case "update":
                    updateGoods(shopCar);
                    break;
                //结算购买商品的金额
                case "pay":
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该商品！");
            }
        }
    }
    private static void queryGoods(Goods[] shopCar) {
    }

    private static void updateGoods(Goods[] shopCar) {
    }

    private static void pay(Goods[] shopCar) {
        System.out.println("-----------查询购物车-----------");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        for (int i=0;i< shopCar.length;i++){
            Goods goods=shopCar [i];
            if (goods!=null){
                System.out.println(goods.id+"\t\t"+goods.name+"\t\t\t"+goods.price+"\t\t\t"+goods.buyNumber);
            }else {
                break;
            }
        }
    }
    private static void addGoods(Goods[] shopCar ,Scanner scanner){
            System.out.println("请您输入购买商品的编号(不重复)：");
            int id = scanner.nextInt();
            System.out.println("请您输入购买商品的名称：");
            String name = scanner.next();
            System.out.println("请您输入购买商品的数量：");
            int buyNumber = scanner.nextInt();
            System.out.println("请您输入购买商品的价格：");
            double price = scanner.nextDouble();

            Goods goods = new Goods();
            goods.id = id;
            goods.name = name;
            goods.buyNumber = buyNumber;
            goods.price = price;

            //遍历
            for (int i = 0; i < shopCar.length; i++) {
                if (shopCar[i] == null) {
                    shopCar[i] = goods;
                    break;
                }
            }
            System.out.println("您的商品：" + goods.name+"添加到购物车完成！");
    }
}
