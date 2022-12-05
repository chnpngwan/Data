package com_2;

import java.net.ServerSocket;
import java.net.Socket;

import com_1.ServerThread;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(9999);
			while(true) {
				Socket socket=serverSocket.accept();
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
