package com.w._0613;

import java.io.IOException;
import java.net.Socket;

/**
 * ClassName:Client
 * PackageName:com.w._0613
 * Description:
 *
 * @date:2022/6/13 10:56
 * @author: wangchunping
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8090);
        SendImpl send=new SendImpl(socket);
        new Thread(send).start();
        ReceiveImpl receive=new ReceiveImpl(socket);
        new Thread(receive).start();
    }
}
