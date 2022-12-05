package com.w._0516;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.*;

/**
 * ClassName:TextRemoval
 * PackageName:com.w._0516
 * Description:
 *
 * @date:2022/5/16 14:02
 * @author: wangchunping
 */
public class TextRemoval {
    public static void main(String[] args) {
        SavaNewFile savaNewFile=new SavaNewFile();
        File file=new File("E://Test\\mo.txt");
        File newFile=new File("E://Test\\xin.txt");
        if (file.exists()){
            String str=savaNewFile.readTxtFile(file);
            str=str.replace("厉害","");
            savaNewFile.writeContent(str,newFile);
            System.out.println("重写成功");
        }else {
            System.out.println("文件不存在，不可读取");
        }
    }
    public void writeContent(String str, File newFile){
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream =new FileOutputStream(newFile);
            byte[] temp=str.getBytes();
            fileOutputStream.write(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String readTextFile(File file){
        String str=null;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream =new FileInputStream(file);
            byte[] temp=new byte[(int) file.length()];
            fileInputStream.read(temp);
            str=new String(temp,"utf-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return str;
    }
}
