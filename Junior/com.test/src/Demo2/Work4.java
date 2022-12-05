package Demo2;

/**
 * ClassName:Work4
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:27
 * @author: wangchunping
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 练习2:
 创建ArrayList实例化对象，添加10个以上的元素，在2号位插入一个元素，获得5号位元素，删除6号位元素，修改7号位的元素；
 并用两种方法遍历该集合
 */
public class Work4 {
    public static void main(String[] args)
    {
        List<Object> list=new ArrayList<>();

        String letter="abcdefghijkl中国opqrstuvwx飞z0123456789";
        for(int i=0;i<12;i++)
        {
            list.add(letter.charAt((int)(Math.random()*letter.length())));
        }
        System.out.println(list.toString());

        list.add(1, "2号位");
        System.out.println(list.toString());

        System.out.println("5号位元素:"+list.get(4));

        System.out.println("删除的6号位元素是:"+list.remove(5));
        System.out.println(list.toString());

        list.set(6, "修改7号位");
        System.out.println(list.toString());

        //遍历方式一
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
        //遍历方式二
        Iterator<Object> it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"\t");
        }
        System.out.println();
        //遍历方式三
        for(Object li:list) {
            System.out.print(li+"\t");
        }
    }
}
