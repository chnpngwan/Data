package javaOOP_01_03_14;

public class Student {
	//Òþ²Ø
	private String name;
	private int age;
	private char sex;
	public int weight;
	
	
	public static void main(String[] args) {
		new Student().sex = 'ÄÐ';
	}
	
	
	//±©Â¶
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
