package javaOOP_01_03_14;
/*static������Щ������
 * 1�����α���==>��̬����
 * 2�����η���==>��̬����
 * 3��static{}��̬�����
 * 
 * ע�⣺
 * 1����̬��������ֱ�ӷ��ʾ�̬���������Ǿ�̬��������ֱ�ӷ�����ͨ��������Ҫ������Ҫ����
 * ����ͨ��������ʡ�
 * 2����̬��������ֱ�ӷ��ʷǾ�̬�����ԣ���Ҫͨ������
 */
public class Demo1 {
	static String name;//��̬����
	//static ���η���
	public static void show() {
		System.out.println("����static���εľ�̬������");
//		play();
	}
	public void play() {
		show();
	}
	
	static {
		System.out.println("����Ǵ�˵�еľ�̬����飡");
	}
	
	public static void main(String[] args) {
		show();
	}

}
