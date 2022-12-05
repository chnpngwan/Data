package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveImpl implements Runnable{
	private Socket socket;
	public ReceiveImpl(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		 try{
             InputStream inputStream=socket.getInputStream();
             byte [] bytes=new byte[1024];
             int len=inputStream.read(bytes);
             System.out.println("收到消息："+new String(bytes,0,len));
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}
