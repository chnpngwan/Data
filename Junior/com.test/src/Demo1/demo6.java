package Demo1;

import java.util.ArrayList;

/**
 * ClassName:demo6
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:27
 * @author: wangchunping
 */
public class demo6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(456);
        list.add(false);
        list.add(456);
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
    }
}
