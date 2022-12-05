package com_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//创建copy的方法
public class Utils {
	FileReader fileReader=null;
	FileWriter fileWriter=null;
	public void copy(File startFile,File endFile) {
		try {
			fileReader=new FileReader(startFile);
			fileWriter=new FileWriter(endFile);
			int data=0;
			while((data=fileReader.read())!=-1) {
				fileWriter.write(data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileWriter!=null) {
					fileWriter.close();
				}
				if (fileReader!=null) {
					fileReader.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
