package com.w.java9;

public class Test {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.eat();
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}
