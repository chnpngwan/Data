package com.w.model;

/**
 * ClassName:Test
 * PackageName:com.w.server
 * Description:
 *
 * @date:2022/7/3 12:25
 * @author: chnpngwng
 */
/**
 * 生产者消费者测试类
 */
public class Test {
    public static void main(String[] args) {
        // new 产品池
        ProductPool productPool = new ProductPool(10);
        // new 生产者和消费者
        Productor productor = new Productor(productPool);
        Consumer consumer = new Consumer(productPool);
        // 开启线程
        productor.start();
        consumer.start();
    }
}
