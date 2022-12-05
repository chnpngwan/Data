package Demo1;

import java.util.ArrayList;

/**
 * ClassName:demo5
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:25
 * @author: wangchunping
 */
public class demo5 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        //1.添加单个元素 可重复
        list.add(123);
        list.add(456);
        list.add(false);
        list.add(456);

        //2.添加另一个集合
        ArrayList list1 = new ArrayList();
        list1.add(12.4);
        list1.add(34.6);

        list.add(list1);//将list1作为一个元素添加到list中
        list.addAll(list1);//将list1中的每个元素迭代添加到list中

        //3.删除元素
        //3.1 按照元素删除
        list.remove(false);
        //3.2按照索引删除
        list.remove(2);

        //4.判断集合中是否包含一个元素
        list.contains(true);

        //5.判断是否为空
        list.isEmpty();

        //6.清除集合
        list.clear();

        //7.返回集合里元素的个数
        list.size();

    }
}
