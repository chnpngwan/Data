package text;

import java.io.File;

public class CopyTest {
	public static void main(String[] args) {
		File startfileFile=new File("E://一剪梅.txt");
		System.out.println(startfileFile.length());
		
		File endfile=new File("E://java高级//一剪梅.txt");
		FileCopyUtil fileCopyUtil=new FileCopyUtil();
		fileCopyUtil.copy(startfileFile, endfile);
	}
}
