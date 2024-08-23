package javaOOP_01_03_28;

public  class Student extends Person{

	@Override
	public void say() {
		System.out.println("重写了父类中的抽象方法！");
	}

}
