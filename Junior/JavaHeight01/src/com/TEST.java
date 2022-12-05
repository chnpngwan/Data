package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TEST {
	public static void main(String[] args) throws Exception {
		File start = new  File("D:\\长征.docx");
		File end =new File("D:\\java高级\\answer");
		end.mkdirs();
		
		
		File file = new File("D:\\java高级\\answer\\长征.docx");
		TEST fcu = new TEST();
		fcu.copy(start, file);
	}
    public void copy(File startfile,File endfile) throws Exception {
		FileInputStream fis = new FileInputStream(startfile);
		FileOutputStream fos = new FileOutputStream(endfile);
		int data = 0;
		while ((data=fis.read())!=-1) {
			fos.write(data);
		}
		System.out.println("文件复制成功");
	}
}
