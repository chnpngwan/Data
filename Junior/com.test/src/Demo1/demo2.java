package Demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:demo2
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/27 11:05
 * @author: wangchunping
 */
public class demo2 {
    public static void main(String[] args) {
        Set set=new HashSet();
        //添加
        set.add("w");
        set.add(1);
        set.add("e");
        set.add(4);
        set.add("5");
        set.add(7);
        set.add("dsdf");
        set.add(0);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object obj:set){
            System.out.println(obj);
        }
    }
}
