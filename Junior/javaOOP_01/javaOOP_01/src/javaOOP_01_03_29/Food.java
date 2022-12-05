package javaOOP_01_03_29;
//接口的定义
public interface Food {
	public String getFood();
}
//麦香鸡块
class McChicken implements Food{
	@Override
	public String getFood() {
		return "麦香鸡块一份";
	}
}
//薯条
class Chips implements Food{
	@Override
	public String getFood() {
		return "薯条一份";
	}
}
//食品生产类
class FoodFactory{
	public static void createFoods(String type) {
		if(type.equals("麦香鸡")) {
			Food mc = new McChicken();
			String food = mc.getFood();
			System.out.println(food);
		}else if(type.equals("薯条")) {
			Food c = new Chips();
			String food = c.getFood();
			System.out.println(food);
		}else {
			System.out.println("我们家暂时没有你要的东西！");
		}
	}
}
