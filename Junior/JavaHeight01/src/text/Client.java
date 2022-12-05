package text;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket=null;
		PrintWriter printWriter=null;
		try {
			socket=new Socket("127.0.0.1",8077);
			Scanner scanner=new Scanner(System.in);
			
			String string=scanner.nextLine();
			String nameString=scanner.nextLine();
			
			OutputStream outputStream=socket.getOutputStream();
			printWriter=new PrintWriter(outputStream);
			printWriter.write(string+" "+nameString);
			System.out.println("您好！"+nameString+"您已经上线了");
			printWriter.flush();
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (printWriter!=null) {
				printWriter.close();
			}try {
				socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
