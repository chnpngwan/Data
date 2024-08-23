package javaoop_01_04_11;

public class Demo1 {
	public static void main(String[] args) {
		try {
//			double c = 5/0;
//			System.out.println(c);
			return;
		}catch(ArithmeticException e) {
			System.out.println("分母为0啦！");
			e.printStackTrace();
//			System.err.println("算术异常");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("释放资源");
		}
//		catch(NullPointerException e) {
//			e.printStackTrace();
//		}
	}

}
