package javaOOP_03_07;

public class TowerDefense {
	int x;
	int y;
	//��ʼ������
	public TowerDefense() {
		System.out.println("�������Ѿ���ʵ������");
	}
	public static void main(String[] args) {
		TowerDefense td = new TowerDefense();
		td.x = 10;
		td.y=15;
		System.out.println("���������ڵ������ǣ�("+td.x+","+td.y+");");
	}

}
