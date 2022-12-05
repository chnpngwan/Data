package com.w._0523;

import java.io.*;

/**
 * ClassName:InstantThread
 * PackageName:com.w._0523
 * Description:
 *
 * @date:2022/5/23 13:41
 * @author: wangchunping
 */
public class InstantThread extends Thread{
    private static File readFile=new File("D:\\福昕高级PDF编辑器专业版v11.1.0.52543绿色精简版.7z");
    private static File writeFile=new File("E:\\福昕高级PDF编辑器专业版v11.1.0.52543绿色精简版.7z");
    @Override
    public void run(){
        long length=readFile.length();
        System.out.println("被拷贝文件大小："+length+"B");
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long currenLength=writeFile.length();
            System.out.println("已经拷贝"+currenLength+"B");
            System.out.println("剩余："+(length-currenLength)+"B");
            if (currenLength>=length){
                System.out.println("文件已经拷贝完成");
                break;
            }
        }
    }
    public void copy(File readFile,File writeFile){
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream =new FileInputStream(readFile);
            fileOutputStream =new FileOutputStream(writeFile);
            int data=0;
            try {
                while ((data=fileInputStream.read())!=-1){
                    fileOutputStream.write(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        InstantThread thread=new InstantThread();
        thread.start();
        thread.copy(readFile,writeFile);
    }
}
