package Demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName:demo7
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:29
 * @author: wangchunping
 */
public class demo7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //演示 采用for循环迭代添加元素
        for(int i = 0;i < 10;i++){
            list.add(i);
        }

        //在2号位插入一个元素  2号位默认为索引
        list.add(2,"insert");

        //获得5号位元素
        list.get(5);

        //删除6号位元素 idea中可以显示是索引还是元素值
        list.remove(6);

        //修改7号位的元素
        list.set(7,"new");

        //使用iterator 进行遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //使用foreach 进行遍历
        for(Object obj:list){
            System.out.print(obj + " ");
        }
        System.out.println();
        //使用for进行遍历
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //使用Lambda表达式的forEach  之前没用过这种结构
        list.forEach(item -> System.out.print(item + " "));
    }
}
