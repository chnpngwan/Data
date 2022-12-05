package com.w.model;

/**
 * ClassName:ProductPool
 * PackageName:com.w.server
 * Description:
 *
 * @date:2022/7/3 12:23
 * @author: chnpngwng
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 产品池
 */
public class ProductPool {
    private List<Product> productList;
    private int maxNum;

    // 构造方法
    public ProductPool(int maxNum) {
        // 用来存放所有的产品
        this.productList = new ArrayList<Product>();
        // 用来表示产品的最大数量
        this.maxNum = maxNum;
    }

    /**
     * 生产方法
     *
     * @param product
     */
    public synchronized void push(Product product) {
        // 判断是否已经达到最大长度，如果是，则进入等待队列
        if (this.productList.size() == maxNum) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.productList.add(product);
        // 唤醒其他线程
        this.notifyAll();
    }

    /**
     * 消费方法
     *
     * @return
     */
    public synchronized Product pop() {
        // 判断是否已经没有产品可以消费，如果没有，则将线程放入等待队列
        if (this.productList.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 消费产品并且返回对应的产品
        Product product = this.productList.remove(0);
        this.notifyAll();
        return product;
    }
}
