package com.w._0509;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName:MyFilenameFilter
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 13:42
 * @author: Yuancoding
 */
public class MyFilenameFilter implements FilenameFilter {


    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java")||name.endsWith(".pptx");
    }
}
