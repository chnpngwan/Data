package com_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

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
			
			String resdLine=bufferedReader.readLine();
			String string[]=resdLine.split(" ");
			System.out.println(string[0]+"您好！我是"+string[1]);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
