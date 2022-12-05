package com.w._0509;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:FileOperator
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 13:36
 * @author: Yuancoding
 */
public class FileOperator {
    public static void main(String[] args) {
        boolean flag = false;
        File directory = new File("E:\\Test");
        if (directory.exists()) {
            File[] fileArray = directory.listFiles();
            for (File file : fileArray) {
                if ("test.txt".equals(file.getName())) {
                    System.out.println("test.txt在E:\\test存在");
                    System.out.println("文件路径："+file.getAbsolutePath());
                    System.out.println("文件大小："+file.length());
                    flag=true;
                    break;
                }
            }
        }else {
            directory.mkdirs();
        }
        if (!flag){
            try {
                File txtFile=new File(directory,"test.txt");
                txtFile.createNewFile();
                System.out.println("文件创建成功:"+txtFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
