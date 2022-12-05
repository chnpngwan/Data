package text;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyUtil {
	FileReader fileReader=null;
	FileWriter fileWriter=null;
	
	public void copy(File startfileFile ,File endfile) {
		try {
			fileReader =new FileReader(startfileFile);
			fileWriter =new FileWriter(endfile);
			int data=0;
			while ((data=fileReader.read())!=-1) {
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
