package javaOOP_01_03_28_night;

public abstract class Animal {
	//�������Ĳ�ʳ����
	public abstract String predation();
	//����ǳ���Ľ�ʳ����
	public void eat() {
		String food = predation();//���ò�ʳ����
		System.out.println("��ʳ������������"+food+"�����ڿ�ʼ��ʳ��");
	}
}

//����tiger��
class Tiger extends Animal{
	@Override
	public String predation() {
		return "����";
	}
}
//����������
class Monkey extends Animal{
	@Override
	public String predation() {
		return "�㽶";
	}
}
//����wolf��
class Wolf extends Animal{
	@Override
	public String predation() {
		return "������";
	}
}
