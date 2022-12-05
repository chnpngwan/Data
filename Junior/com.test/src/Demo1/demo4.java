package Demo1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * ClassName:demo4
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:13
 * @author: wangchunping
 */
public class demo4 {
    public static void main(String[] args) {
        Comparator comparator=new Comparator() {
            //排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String&& o2 instanceof String){
                    String str1=(String) o1;
                    String str2=(String) o2;
                    return -str1.compareTo(str2);
                }else {
                    throw  new RuntimeException("输入数据类型不同");
                }
            }
        };
        TreeSet treeSet =new TreeSet(comparator);
        treeSet.add("uyhg");
        treeSet.add("adfsef");
        treeSet.add("adsa");
        Iterator iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
