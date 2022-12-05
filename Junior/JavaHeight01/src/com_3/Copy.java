package com_3;

import java.io.File;
//创建目录
public class Copy {
	public static void main(String[] args) {
		File file=new File("E://java高级//test");
		file.mkdirs();
		if (file.exists()) {
			System.out.println("创建成功！");
		}
	}
}
