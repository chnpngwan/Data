package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(8088);
		Socket socket=serverSocket.accept();
		SendImpl sendImpl=new SendImpl(socket);
		new Thread(sendImpl).start();
		ReceiveImpl receiveImpl=new ReceiveImpl(socket);
		new Thread(receiveImpl).start();
	}
}
