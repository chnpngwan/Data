package com.w.animal;

public class AnimalDome {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("小白");
        cat.setAge(2);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.catchMouse();

        Cat cat1=new Cat("加菲猫",4);
        System.out.println(cat1.getName()+","+cat1.getAge());
        cat1.catchMouse();

        Dog dog=new Dog("小白",4);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.lookDoor();
    }
}
