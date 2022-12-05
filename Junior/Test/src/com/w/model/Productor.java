package com.w.model;

/**
 * ClassName:Productor
 * PackageName:com.w.server
 * Description:
 *
 * @date:2022/7/3 12:24
 * @author: chnpngwng
 */
/**
 * 生产者
 */
public class Productor extends Thread {
    private ProductPool productPool;

    // 采用构造方法，将产品池引入
    public Productor(ProductPool productPool) {
        this.productPool = productPool;
    }

    @Override
    public void run() {
        while (true) {
            // 随机生成生产的产品
            String name = (int) (Math.random() * 100) + "号产品";
            Product product = new Product(name);
            productPool.push(product);
            System.out.println("The product is producting product......named " + product.getName());
        }
    }
}
