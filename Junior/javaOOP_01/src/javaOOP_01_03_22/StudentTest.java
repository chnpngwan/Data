package javaOOP_01_03_22;

public class StudentTest {
	public static void main(String[] args) {
//	 �������� ������ = new  ���췽��();
		Student stu = new Student();
		stu.job();
		/* ����ת��
		 * �������ͣ������͵�����ָ���������
		 * ���õķ�����������������д�ķ���
		 * ע�⣺����ת�Ͷ�����ֱ�ӷ��������вŴ��ڵķ���
		 */
		Person p = new Student();
		p.job();
//		p.say();
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		
		/*
		 * ����ת�ͣ������͵�����ָ�����͵Ķ���
		 * ����ת�ͻ��������ʱ�쳣��������ʹ��
		 */
		Student s = (Student)new Person();
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
//		s.job();
//		s.say();
		
		
		
		
	}

}
