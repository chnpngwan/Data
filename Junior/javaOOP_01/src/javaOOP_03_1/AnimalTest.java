package javaOOP_03_1;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "Ð¡¹·";
		a.age = 2;
		a.sex = 'ÄÐ';
		a.eat();
		
		Animal animal = new Animal("dog",1,'ÄÐ');
		animal.eat();
	}

}
