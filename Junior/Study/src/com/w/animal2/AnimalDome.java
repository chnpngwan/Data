package com.w.animal2;
//接口
public class AnimalDome {
    public static void main(String[] args) {
        Jumpping jumpping=new Cat();
        jumpping.jump();
        System.out.println("---------------");

        Animal animal=new Cat();
        animal.setName("加菲猫");
        animal.setAge(4);
        System.out.println(animal.getName()+","+animal.getAge());
        animal.eat();

        animal=new Cat("加菲猫",3);
        System.out.println(animal.getName()+","+animal.getAge());
        animal.eat();
        System.out.println("----------------");

        Cat cat=new Cat();
        cat.setName("加菲猫");
        cat.setAge(3);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.eat();
        cat.jump();


        Jumpping jumpping1=new Dog();
        jumpping.jump();
        System.out.println("---------------");

        Animal animal1=new Dog();
        animal1.setName("小白");
        animal1.setAge(4);
        System.out.println(animal1.getName()+","+animal1.getAge());
        animal1.eat();

        animal1=new Cat("小白",3);
        System.out.println(animal1.getName()+","+animal1.getAge());
        animal1.eat();
        System.out.println("----------------");

        Dog dog=new Dog();
        dog.setName("小白");
        dog.setAge(3);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();
        dog.jump();
    }
}
