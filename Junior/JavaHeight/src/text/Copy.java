package text;

import java.io.File;

public class Copy {
	public static void main(String[] args) {
		File file=new File("E://java高级//text");
		file.mkdirs();
		if(file.exists()) {
			System.out.println("创建成功！");
		}
	}
}
