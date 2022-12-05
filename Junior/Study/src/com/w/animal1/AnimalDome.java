package com.w.animal1;
//抽象
public class AnimalDome {
    public static void main(String[] args) {
        //多态
        Animal animal=new Cat();
        animal.setName("加菲猫");
        animal.setAge(2);
        System.out.println(animal.getName()+","+animal.getAge());
        animal.eat();

        animal=new Cat("加菲猫",3);
        System.out.println(animal.getName()+","+animal.getAge());
        animal.eat();

        Animal animal1=new Dog();
        animal1.setName("小白");
        animal1.setAge(2);
        System.out.println(animal1.getName()+","+animal1.getAge());
        animal1.eat();

        animal1=new Cat("小白",3);
        System.out.println(animal1.getName()+","+animal1.getAge());
        animal1.eat();
    }
}
