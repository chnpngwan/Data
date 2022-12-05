package copy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class FileCopyUtil {
	private FileInputStream fileInputStream=null;
	private FileOutputStream fileOutputStream=null;
	public void copy(File startflie,File endfile) {
		if (startflie!=null&&endfile!=null) {
			try {
				fileInputStream=new FileInputStream(startflie);
				fileOutputStream=new FileOutputStream(endfile);
				int len=(int) startflie.length();
				byte [] b=new byte[len];
				try {
					fileInputStream.read(b);
					fileOutputStream.write(b);
					System.out.println("复制成功");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					fileOutputStream.close();
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
