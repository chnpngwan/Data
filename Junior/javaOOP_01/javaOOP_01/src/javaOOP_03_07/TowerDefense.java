package javaOOP_03_07;

public class TowerDefense {
	int x;
	int y;
	//初始化数据
	public TowerDefense() {
		System.out.println("防御塔已经被实例化了");
	}
	public static void main(String[] args) {
		TowerDefense td = new TowerDefense();
		td.x = 10;
		td.y=15;
		System.out.println("防御塔所在的坐标是：("+td.x+","+td.y+");");
	}

}
