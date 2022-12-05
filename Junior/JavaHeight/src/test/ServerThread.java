package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable{
	public Socket socket;
	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				String readLine = bufferedReader.readLine();
				String str[]=readLine.split(" ");
				System.out.println(str[0]+"您好！我是"+str[1]);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
