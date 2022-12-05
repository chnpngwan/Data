package Demo1;

import java.util.Collection;
import java.util.HashSet;

/**
 * ClassName:demo1
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/27 10:47
 * @author: wangchunping
 */
public class demo1 {
    public static void main(String[] args) {
        Collection collection=new HashSet();
       //添加单个元素
       collection.add("abc");
       collection.add("123456");
       collection.add("我很快乐");
        System.out.println(collection);

       //添加另一个集合
        Collection collection1=new HashSet();
        collection1.add("wcp");
        collection1.add("高兴");
        collection.addAll(collection1);
        System.out.println(collection);

        //删除元素
        collection.remove(6.2);
        System.out.println(collection);

        //判断集合中是否包含一个元素
        collection.contains(false);
        System.out.println(collection);

        //判断是否为空
        collection.isEmpty();

        //清除集合]
        collection.clear();
        //返回集合里元素的个数等常用操作
        collection.size();
    }
}
