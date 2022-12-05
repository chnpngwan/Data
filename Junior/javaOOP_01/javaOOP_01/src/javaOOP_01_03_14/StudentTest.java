package javaOOP_01_03_14;

public class StudentTest {
	public static void main(String[] args) {
		Student stu = new Student();
//		stu.name = "张三";
//		stu.age = 18;
		stu.setName("张三");
		stu.setAge(19);
		System.out.println(stu.getName()+","+stu.getAge());
//		stu.sex = '女';
	}

}
