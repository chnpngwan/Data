package com.w._0606;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:DataServer
 * PackageName:com.w._0606
 * Description:
 *
 * @date:2022/6/6 14:13
 * @author: wangchunping
 */
public class DataServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8090);
        System.out.println("服务端使用8090端口，监听客户的连接");
        Socket socket=serverSocket.accept();
        System.out.println("又客户端连接到服务端");
        OutputStream outputStream=socket.getOutputStream();
        PrintWriter printWriter=new PrintWriter(outputStream);
        printWriter.println("欢迎您的访问");
        printWriter.close();
        serverSocket.close();
    }
}
