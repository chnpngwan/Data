package javaoop_01_04_11;

public class Demo1 {
	public static void main(String[] args) {
		try {
//			double c = 5/0;
//			System.out.println(c);
			return;
		}catch(ArithmeticException e) {
			System.out.println("��ĸΪ0����");
			e.printStackTrace();
//			System.err.println("�����쳣");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�ͷ���Դ");
		}
//		catch(NullPointerException e) {
//			e.printStackTrace();
//		}
	}

}
