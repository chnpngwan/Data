package copy;

import java.io.File;

public class copyTest {
	public static void main(String[] args) {
		File startflie=new File("E:\\一剪梅.txt");
		System.out.println(startflie.length());
		
		File endfile=new File("E:\\java高级\\一剪梅.txt");
		FileCopyUtil copyUtil=new FileCopyUtil();
		copyUtil.copy(startflie, endfile);
		//FileCopyUtil2 copyUtil2=new FileCopyUtil2();
		//copyUtil2.copy(startflie, endfile);
	}
}
