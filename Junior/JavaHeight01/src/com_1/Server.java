package com_1;

import java.net.ServerSocket;
import java.net.Socket;

import text.ServerThread;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(9999);
			while (true) {
				Socket socket=serverSocket.accept();
				new Thread(new ServerThread(socket)).start();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
