package test;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(8088);
			while (true) {
				Socket socket=serverSocket.accept();
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
