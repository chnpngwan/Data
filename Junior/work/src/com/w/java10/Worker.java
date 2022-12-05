package com.w.java10;
//私有属性工号和工作方法（输出我爱工作）
public class Worker extends Person{
    private int workerId;

    public void work() {
        System.out.println("我爱工作");
    }


    public Worker(String name, int age,int workerId) {
        super(name, age);
        this.workerId = workerId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public void eat() {
        System.out.println("吃快餐");
    }

    @Override
    public void sleep() {
        System.out.println("每天睡6小时");
    }


}
