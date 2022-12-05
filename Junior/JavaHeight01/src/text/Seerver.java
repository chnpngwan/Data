package text;

import java.net.ServerSocket;
import java.net.Socket;

public class Seerver {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(8077);
			while (true) {
				Socket socket=serverSocket.accept();
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
