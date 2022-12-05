package com.w._0328;

public abstract class Animal {
	public abstract String predation();
	public void eat(){
		String food= predation();
		System.out.println("捕食结束，捕获了"+food+"现在开始进食");
	}
}

class Tiger extends Animal{
	@Override
	public String predation(){
		return "羚羊";
	}
}

class Monkkey extends Animal{
	@Override
	public String predation(){
		return "香蕉";
	}
}

class Wolff extends Animal{
	@Override
	public String predation(){
		return "喜羊羊";
	}
}