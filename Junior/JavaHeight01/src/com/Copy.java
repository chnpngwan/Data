package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;import java.security.spec.MGF1ParameterSpec;

public class Copy {
	public static void main(String[] args) {
		File f1=new File("E:\\yi.txt");//源文件
		File f2=new File("E:\\javagaoji\\answer");//目的地
		f2.mkdirs();
		File f3=new File("E:\\javagaoji\\answer\\yi.txt");//复制的位置
		Copy copy=new Copy();
		copy.copy(f1, f3);
	}
	public void copy(File f1,File f2) {
		//声明输入输出
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			//初始化输入输出
			fis=new FileInputStream(f1);
			fos=new FileOutputStream(f2);
				int data=0;
				while((data=fis.read())!=-1) {
					fos.write(data);
				}
				System.out.println("文件复制成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
