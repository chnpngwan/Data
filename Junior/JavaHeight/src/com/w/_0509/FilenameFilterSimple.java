package com.w._0509;

import java.io.File;

/**
 * ClassName:FilenameFilterSimple
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 13:57
 * @author: Yuancoding
 */
public class FilenameFilterSimple {
    public static void main(String[] args) {
        File file=new File("E:\\test");
        String[] names=file.list(new MyFilenameFilter());
        for (String name : names){
            System.out.println(name);
        }
    }
}
