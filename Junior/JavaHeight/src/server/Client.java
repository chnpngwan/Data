package server;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1",8088);
		SendImpl sendImpl=new SendImpl(socket);
		new Thread(sendImpl).start();
		ReceiveImpl receiveImpl=new ReceiveImpl(socket);
		new Thread(receiveImpl).start();
	}
}