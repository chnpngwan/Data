package com.w._0509;

import java.io.File;
import java.util.Comparator;

/**
 * ClassName:FileComparator
 * PackageName:com.w._0509
 * Description:
 *
 * @date:2022/5/9 14:27
 * @author: Yuancoding
 */
public class FileComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        File file1 = (File) o1;
        File file2 = (File) o2;
        if (file1.length() > file2.length()) {
            return -1;
        } else if (file1.length() < file2.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}
