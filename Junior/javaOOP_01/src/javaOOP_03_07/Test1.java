package javaOOP_03_07;

import java.util.Arrays;

public class Test1 {
	//有可变形参的方法
	//可变参数只能放在参数的末尾
	//一个方法中只能存在一个可变形参
	public void play(String ... obj) {
		if(obj!=null&&obj.length>0) {
			System.out.println(Arrays.toString(obj));
			for(String s:obj) {
				System.out.println(s);
			}
		}else {
			System.out.println("没有参数传递！");
		}
	}
	public void display(String[] obj) {
		if(obj!=null&&obj.length>0) {
			System.out.println(Arrays.toString(obj));
			for(String s:obj) {
				System.out.println(s);
			}
		}else {
			System.out.println("没有参数传递！");
		}
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.play();
		t.play("张三","李四","王五","赵六","田七");
		t.play(new String[] {"jack"});
		t.display(new String[] {});
		t.display(new String[] {"李四","王五","赵六"});
	}

}
