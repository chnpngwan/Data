package com_3;

import java.io.File;

public class CopyTest {
	public static void main(String[] args) {
		File startFile=new File("E://yi.txt");
		System.out.println(startFile.length());
		File endFile=new File("E://java高级//test//yi.txt");
		Utils utils=new Utils();
		utils.copy(startFile, endFile);
	}
}
