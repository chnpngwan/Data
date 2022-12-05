package com.w._0509;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName:FindMaximumImadeFile
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 14:40
 * @author: Yuancoding
 */
public class FindMaximumImageFile {
    public static void main(String[] args) {
        File directory=new File("E:\\test");
        File[] files=directory.listFiles(new ImageFileFilter());
        if (files!=null){
            Arrays.sort(files,new FileComparator());
            File targetFile=files[0];
            System.out.println("文件路径："+targetFile.getAbsolutePath());
            System.out.println("文件大小："+targetFile.length());
        }else {
            System.out.println("该目录内没有文件！");
        }
    }
}
