package com.w._0606;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Server
 * PackageName:com.w._0606
 * Description:
 *
 * @date:2022/6/6 13:32
 * @author: wangchunping
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8070);
            System.out.println("服务端套接字已经创建，开始等待来自客户端连接");
            Socket socket=serverSocket.accept();
            System.out.println("有客户端成功连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
