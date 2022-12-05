package javaOOP_01_03_22;

public class StudentTest {
	public static void main(String[] args) {
//	 引用类型 对象名 = new  构造方法();
		Student stu = new Student();
		stu.job();
		/* 向上转型
		 * 向上造型：父类型的引用指向子类对象
		 * 调用的方法还是子类中下重写的方法
		 * 注意：向上转型对象不能直接访问子类中才存在的方法
		 */
		Person p = new Student();
		p.job();
//		p.say();
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		
		/*
		 * 向下转型：子类型的引用指向父类型的对象
		 * 向下转型会存在运行时异常，不建议使用
		 */
		Student s = (Student)new Person();
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
//		s.job();
//		s.say();
		
		
		
		
	}

}
