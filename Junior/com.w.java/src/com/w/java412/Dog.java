package com.w.java412;

/**
 * @author admin
 */
public class Dog {
    private String dogName;

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return false;}
        if (!(obj instanceof Dog)){
            return false;}
        if (obj == null ){
            return true;}
        Dog dog = (Dog) obj;
        if (dogName.equals(dog.dogName)) {
            return true;
        } else{
            return false;
        }
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setDogName("小白");
        Dog dog1=new Dog();
        dog1.setDogName("小白");
        System.out.println("dog.equals(dog1):"+dog.equals(dog1));
    }
}
