package com_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
//线程
public class ServerThread implements Runnable{
	public Socket socket;
	public ServerThread(Socket socket) {
		super();
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readString=bufferedReader.readLine();
			String string[]=readString.split(" ");
			System.out.println(string[0]+"您好！我是"+string[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
