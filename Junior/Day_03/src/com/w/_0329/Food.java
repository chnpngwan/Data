package com.w._0329;

public interface Food {
	public String getFood() ;
}
class McChicken implements Food{
@Override
	public String getFood() {
	return "麦香鸡一份";
	}
}
class chips implements Food{
	@Override
	public String getFood() {
		return "薯条一份";
	}
}
class FoodFactory{
	public static void createFoods(String type){
		if (type.equals("麦香鸡")) {
			Food mc=new McChicken();
			String food=mc.getFood();
			System.out.println(food);
		}else if (type.equals("薯条一份")) {
			Food c=new chips();
			String food=c.getFood();
			System.out.println(food);
		}else {
			System.out.println("对不起没有！");
		}
	}
}