package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:MapTest
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/29 12:37
 * @author: wangchunping
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();//定义一个Map接口类型的变量，引用一个实现类

        //添加键值对
        hashMap.put("王昭君", 24);
        hashMap.put("貂蝉 ", 21);
        hashMap.put("孙尚香", 26);
        hashMap.put("蔡文姬 ", 25);
        System.out.println(hashMap);

        //判断集合中是否包含某一key值
        System.out.println(hashMap.containsKey("王昭君"));

        //通过某一key值得到value值
        Set<String> keys = hashMap.keySet();
        System.out.println(hashMap.get("王昭君"));

        //通过某一key删除键值对
        hashMap.remove("王昭君");
        System.out.println(hashMap);

        //把另一个map集合添加到此map集合
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("赵丽颖", 31);
        map.put("王彦霖 ", 25);
        hashMap.putAll(map);
        System.out.println("新建Map集合为： " + map);
        System.out.println("将map集合添加到hashMap集合后的结果为： " + hashMap);

        //判断是否为空
        System.out.println(hashMap.isEmpty());

        //清除集合
        hashMap.clear();
        System.out.println("hashMap集合清空后：" + hashMap);

        //返回集合里元素的个数
        System.out.println("集合里元素的个数为： " + hashMap.size());
    }
}
