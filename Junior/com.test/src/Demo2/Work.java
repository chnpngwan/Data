package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Wprk
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:22
 * @author: wangchunping
 */
/*
 *  6.使用HashMap类实例化一个Map类型的对象m1，键（String类型）和值（int型）分别用于存储员工的
 *		姓名和工资，存入数据如下：
 *		张三——800元；李四——1500元；王五——3000元；
 *			1）将张三的工资更改为2600元
 *			2）为所有员工工资加薪100元；
 * 			3）遍历集合中所有的员工
 *			4）遍历集合中所有的工资
 */
public class Work {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("张三", 800);
        hashMap.put("李四", 1500);
        hashMap.put("王五", 3000);
        System.out.println("----------员工信息如下------------");
        System.out.println(hashMap);

        System.out.println("--------将张三的工资更改为2600元-----------");
        hashMap.put("张三", 2600);//1）将张三的工资更改为2600元
        System.out.println(hashMap.get("张三"));

        System.out.println("---------为所有员工工资加薪100元-----------");
        Set<String> keys = hashMap.keySet();//2）为所有员工工资加薪100元；
        for(String key:keys) {
            Integer value = hashMap.get(key) + 100;
            hashMap.put(key, value);
        }
        System.out.println(hashMap);

        //3）遍历集合中所有的员工
        System.out.println("--------遍历集合中所有的员工------------");
        for(String key1:keys) {
            System.out.println(key1);
        }

        //4）遍历集合中所有的工资
        System.out.println("--------遍历集合中所有的工资------------");
        for(String key2:keys) {
            System.out.println(hashMap.get(key2));
        }
    }
}
