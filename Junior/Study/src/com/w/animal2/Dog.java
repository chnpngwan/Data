package com.w.animal2;

public class Dog extends Animal implements Jumpping{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("狗会跳");
    }
}
