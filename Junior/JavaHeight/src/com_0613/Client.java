package com_0613;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket=new Socket("127.0.0.1",8099);
        SendImpl send=new SendImpl(socket);
        new Thread(send).start();
        ReceiveImpl receive=new ReceiveImpl(socket);
        new Thread(receive).start();
	}
}
