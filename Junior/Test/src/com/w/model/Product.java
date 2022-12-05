package com.w.model;

/**
 * ClassName:Product
 * PackageName:com.w.server
 * Description:
 *
 * @date:2022/7/3 12:21
 * @author: chnpngwng
 */
/**
 * 产品类
 */
public class Product {
    public Product(String name) {
        this.name = name;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
