package javaOOP_03_07;

public class Demo2 {
	/*
	 * ���δ�  ����ֵ����  �������ƣ���������...�������ƣ�{
	 * 		�����壻
	 * }
	 */
	public void aoo(int x,String...str) {
		System.out.println("����һ���пɱ�����ķ���");
		if(str!=null&&str.length>0) {
			for(String s:str) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.aoo(10);
		d2.aoo(12, "����","��˹","Ф����");
	}

}
