package com.w._0606;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName:Client
 * PackageName:com.w._0606
 * Description:
 *
 * @date:2022/6/6 13:39
 * @author: wangchunping
 */
public class Client {
    public static void main(String[] args) {
        Socket client=null;
        try {
            client=new Socket("127.0.0.1",8070);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (client!=null){
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
