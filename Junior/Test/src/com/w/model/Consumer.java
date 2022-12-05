package com.w.model;

/**
 * ClassName:Consumer
 * PackageName:com.w.server
 * Description:
 *
 * @date:2022/7/3 12:24
 * @author: chnpngwng
 */
/**
 * 消费者
 */
public class Consumer extends  Thread {
    private ProductPool productPool;

    // 采用构造方法，将产品池引入
    public Consumer(ProductPool productPool) {
        this.productPool = productPool;
    }

    @Override
    public void run() {
        while (true) {
            // 消费产品，并且取出已经消费的产品
            Product product = this.productPool.pop();
            System.out.println("The consumer is consuming product......named " + product.getName());
        }
    }
}
