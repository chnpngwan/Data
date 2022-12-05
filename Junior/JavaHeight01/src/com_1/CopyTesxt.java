package com_1;

import java.io.File;

public class CopyTesxt {
	public static void main(String[] args) {
		File starFile=new File("E://text.txt");
		System.out.println(starFile.length());
		File endFile=new File("E://test//jiwang//text.txt");
		Utils utils=new Utils();
		utils.copy(starFile, endFile);
	}
}
