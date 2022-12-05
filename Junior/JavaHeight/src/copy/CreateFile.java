package copy;

import java.io.File;

public class CreateFile {
public static void main(String[] args) {
	File file=new File("E://java高级//answer");
	file.mkdirs();
	if (file.exists()) {
		System.out.println("文件创建成功！");
	}
}
}
