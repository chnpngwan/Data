package com.w._0509;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName:ImageFileFilter
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 14:24
 * @author: Yuancoding
 */
public class ImageFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".jpg");
    }
}
