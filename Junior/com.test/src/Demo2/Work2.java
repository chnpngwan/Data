package Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Work2
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:25
 * @author: wangchunping
 */
public class Work2 {
    public static void main(String[] args) {

        List<String> sr = new ArrayList<String>();
        //增加元素
        sr.add("1");
        sr.add("12");
        sr.add("123");
        sr.add("1234");
        sr.add("12345");
        sr.add("123456");
        sr.add("1234567");
        sr.add("12345678");
        sr.add("123456789");
        sr.add("1234567890");
        //特定位置添加元素
        sr.add(2,"添加了");

        System.out.println(sr);
        //获得特定元素
        String t = sr.get(5);

        System.out.println(t);
        //删除额定元素
        sr.remove(6);

        System.out.println(sr);
        //
        sr.set(7,"修改了");

        System.out.println(sr);

    }

}
