package Demo2;

/**
 * ClassName:Work3
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:26
 * @author: wangchunping
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 练习1:
 1、生成10个随机数，值在100到200之间；
 2、将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 3、将这个HashSet集合转换成ArrayList集合
 4、重新为ArrayList集合排序，按照从小到大的顺序；
 5、遍历该集合；
 */
public class Work3 {
    public static void main(String[] args)
    {
        Set<Integer> set=new HashSet<>(10);
        for(int i=0; i<10;i++)
        {
            set.add((int)((Math.random())*101+100));//将这十个数存入HashSet集合中
        }
        System.out.println(set.toString());

        ArrayList<Integer> arrlist=new ArrayList<>(set);//HashSet集合转换成ArrayList集合
        System.out.println(arrlist.toString());

        Collections.sort(arrlist);//按照从小到大的顺序
        System.out.println(arrlist.toString());

        //遍历
        for(int i=0;i<arrlist.size();i++)
        {
            System.out.print(arrlist.get(i)+"\t");
        }
    }
}
