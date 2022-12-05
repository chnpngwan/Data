package Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:Work1
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:24
 * @author: wangchunping
 */
public class Work1 {
    public static void main(String[] args) {
        List<Integer> sr = new ArrayList<Integer>();

        sr.add(1);
        sr.add(4);
        sr.add(5);
        sr.add(9);
        sr.add(3);
        sr.add(6);

        Collections.sort(sr);
        System.out.println(sr);
        Collections.reverse(sr);
        System.out.println(sr);

    }
}
