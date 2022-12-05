package com_3;

import java.net.ServerSocket;
import java.net.Socket;

import com_1.ServerThread;

//服务端
public class Serve {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(8088);
			while(true) {
				Socket socket=serverSocket.accept();
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
