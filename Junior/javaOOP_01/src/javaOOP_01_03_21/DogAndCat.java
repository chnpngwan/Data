package javaOOP_01_03_21;

public class DogAndCat {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "二哈";
		dog.color = "灰色";
		dog.age = 2;
		dog.eat();
		dog.job();
		
		Cat cat = new Cat();
		cat.name = "加菲猫";
		cat.color = "黄色";
		cat.age = 1;
		cat.eat();
//		cat.job();
	}

}
