package com_1;

import java.io.File;

public class Copy {
	public static void main(String[] args) {
		File file=new File("E://test//jiwang");
		file.mkdirs();
		if (file.exists()) {
			System.out.println("创建成功！");
		}
	}
}
