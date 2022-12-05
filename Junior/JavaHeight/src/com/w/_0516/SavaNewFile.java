package com.w._0516;

import java.io.*;

/**
 * ClassName:SavaNewFile
 * PackageName:com.w._0516
 * Description:
 *
 * @date:2022/5/16 13:31
 * @author: wangchunping
 */
public class SavaNewFile {
    public static void main(String[] args) {
        SavaNewFile savaNewFile=new SavaNewFile();
        File file=new File("E://Test\\wen.txt");
        File newFile=new File("E://Test\\xie.txt");
        if (file.exists()){
            String str=savaNewFile.readTxtFile(file);
            savaNewFile.writeContent(str+"【来自新华社】",newFile);
            System.out.println("重写文件成功");
        }else {
            System.out.println("该文件不存在，不能读取");
        }
    }
    public void writeContent(String str,File newFile){
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream =new FileOutputStream(newFile);
            byte [ ] temp=str.getBytes();
            fileOutputStream.write(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream !=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String readTxtFile(File file){
        String str=null;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream =new FileInputStream(file);
            byte[ ] temp =new byte[(int) file.length()];
            fileInputStream.read(temp);
            str=new String(temp,"utf-8");
            System.out.println("原始内容："+str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileInputStream !=null){
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
