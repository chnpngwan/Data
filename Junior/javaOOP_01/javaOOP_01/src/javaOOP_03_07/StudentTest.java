package javaOOP_03_07;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "jack";
		stu1.age = 19;
		stu1.sex = 'ÄÐ';
		stu1.show();
		Student stu2 = new Student();
		stu2.name = "alan";
		stu2.age = 18;
		stu2.sex = 'Å®';
		stu2.show();
	}

}
