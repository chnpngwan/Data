package com.w._0613;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * ClassName:ReceiveImpl
 * PackageName:com.w._0613
 * Description:
 *
 * @date:2022/6/13 10:49
 * @author: wangchunping
 */
public class ReceiveImpl implements Runnable{
    private Socket socket;
    public ReceiveImpl(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        while (true){
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
}
