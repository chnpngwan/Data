package com.w._0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * ClassName:DataCilent
 * PackageName:com.w._0606
 * Description:
 *
 * @date:2022/6/6 14:23
 * @author: wangchunping
 */
public class DataClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("172.20.38.140",8090);
        System.out.println("客户端root："+socket);
        InputStream inputStream=(InputStream) socket.getInputStream();
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String data=bufferedReader.readLine();
        System.out.println("服务端对客户端说："+data);
        bufferedReader.close();
        socket.close();
    }
}
