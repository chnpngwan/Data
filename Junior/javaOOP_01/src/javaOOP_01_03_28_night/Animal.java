package javaOOP_01_03_28_night;

public abstract class Animal {
	//定义抽象的捕食方法
	public abstract String predation();
	//定义非抽象的进食方法
	public void eat() {
		String food = predation();//调用捕食方法
		System.out.println("捕食结束，捕获了"+food+"，现在开始进食！");
	}
}

//创建tiger类
class Tiger extends Animal{
	@Override
	public String predation() {
		return "羚羊";
	}
}
//创建猴子类
class Monkey extends Animal{
	@Override
	public String predation() {
		return "香蕉";
	}
}
//创建wolf类
class Wolf extends Animal{
	@Override
	public String predation() {
		return "懒羊羊";
	}
}
