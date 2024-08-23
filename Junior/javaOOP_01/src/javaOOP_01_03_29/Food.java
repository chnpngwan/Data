package javaOOP_01_03_29;
//�ӿڵĶ���
public interface Food {
	public String getFood();
}
//���㼦��
class McChicken implements Food{
	@Override
	public String getFood() {
		return "���㼦��һ��";
	}
}
//����
class Chips implements Food{
	@Override
	public String getFood() {
		return "����һ��";
	}
}
//ʳƷ������
class FoodFactory{
	public static void createFoods(String type) {
		if(type.equals("���㼦")) {
			Food mc = new McChicken();
			String food = mc.getFood();
			System.out.println(food);
		}else if(type.equals("����")) {
			Food c = new Chips();
			String food = c.getFood();
			System.out.println(food);
		}else {
			System.out.println("���Ǽ���ʱû����Ҫ�Ķ�����");
		}
	}
}
