package com_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Utils {
	FileReader fileReader=null;
	FileWriter fileWriter=null;
	
	public void copy(File start,File end) {
		try {
			fileReader=new FileReader(start);
			fileWriter=new FileWriter(end);
			int data=0;
			while ((fileReader.read())!=-1) {
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
