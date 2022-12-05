package com.w._0613;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName:SendImpl
 * PackageName:com.w._0613
 * Description:
 *
 * @date:2022/6/13 10:45
 * @author: wangchunping
 */
public class SendImpl implements Runnable{
    private Socket socket;
    public SendImpl(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try{
                OutputStream outputStream=socket.getOutputStream();
                String string=scanner.nextLine();
                outputStream.write(string.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
