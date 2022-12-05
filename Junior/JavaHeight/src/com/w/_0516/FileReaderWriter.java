package com.w._0516;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:FileReaderWriter
 * PackageName:com.w._0516
 * Description:
 *
 * @date:2022/5/16 14:26
 * @author: wangchunping
 */
public class FileReaderWriter {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader =new FileReader("E://Test\\xin.txt");
            fileWriter =new FileWriter("E://Test\\wen.txt");
            int data;
            while ((data=fileReader.read())!=-1){
                fileWriter.write(data);
            }
            fileWriter.write("\r\n好开心");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader!=null){
                    fileReader.close();
                }
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
