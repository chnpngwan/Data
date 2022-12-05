package javaOOP_03_1;

public class StudentTest {
	public static void main(String[] args) {
		//创建学生对象
		Student stu = new Student();
		//为属性赋值
		stu.name = "宋忠豪";
		stu.age = 25;
		stu.sex = '女';
		//调用方法
		stu.study();
		
		Student student = new Student("小项",20,'男');
		student.study();
		
	}

}
