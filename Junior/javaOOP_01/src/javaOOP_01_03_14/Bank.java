package javaOOP_01_03_14;
//ע�⣺��̬�����Է��ʷ�ʽ��
//     1������.����
//     2��������.����
public class Bank {
	private static int count = 50000;
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
//			Bank bank = new Bank();
//			bank.count -= 1000;
//			System.out.println("ȡ��ɹ����˻����Ϊ��"+bank.count);
			Bank.count-= 1000;
			System.out.println("ȡ��ɹ����˻����Ϊ��"+count);
		}
	}

}
