package com_0613;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		 ServerSocket socket=new ServerSocket(8099);
	        Socket socket1=socket.accept();
	        SendImpl send=new SendImpl(socket1);
	        new Thread(send).start();
	        ReceiveImpl receive=new ReceiveImpl(socket1);
	        new Thread(receive).start();
	}
}
