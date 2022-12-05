package com.w._0613;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Server
 * PackageName:com.w._0613
 * Description:
 *
 * @date:2022/6/13 10:54
 * @author: wangchunping
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(8090);
        Socket socket1=socket.accept();
        SendImpl send=new SendImpl(socket1);
        new Thread(send).start();
        ReceiveImpl receive=new ReceiveImpl(socket1);
        new Thread(receive).start();
    }
}
