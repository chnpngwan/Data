package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:MapTest2
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:12
 * @author: wangchunping
 */
public class MapTest2 {
    /*
     * 5.使用Map接口的实现类完成员工工资(姓名--工资)的摸拟：
     *	key---姓名String  value--工资 Double
     *		1)添加几条信息
     *		2)列出所有的员工姓名
     *		3列出所有员工姓名及其工资
     *		4)删除名叫“Tom”的员工信息
     *		5)输出Jack的工资，并将其工资加1000元(通过取值实现)
     *		6)将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
     */
        public static void main(String[] args) {
            Map<String, Double> hashMap = new HashMap<String, Double>();

            hashMap.put("Jack", 1500.0);//1)添加几条信息
            hashMap.put("Judy", 700.0);
            hashMap.put("Tony", 900.0);
            hashMap.put("Dhong", 1900.0);
            hashMap.put("Tom", 2500.0);

            Set<String> keys = hashMap.keySet();//2)列出所有的员工姓名
            System.out.println("2)列出所有的员工姓名： ");
            for(String key:keys) {
                System.out.println(key);
            }

            //3列出所有员工姓名及其工资
            System.out.println("3列出所有员工姓名及其工资： ");
            for(String key2:keys) {
                System.out.println(key2 + ":" + hashMap.get(key2));
            }
            //4)删除名叫“Tom”的员工信息
            hashMap.remove("Tom");
            System.out.println(hashMap);

            //5)输出Jack的工资，并将其工资加1000元(通过取值实现)
            System.out.println("Jack的工资： " + hashMap.get("Jack") + 1000);

            //6)将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
            Set<HashMap.Entry<String, Double>> entry = hashMap.entrySet();
            for(HashMap.Entry<String, Double> e:entry) {
                if(e.getValue() < 1000.0) {
                    Double value = e.getValue() * 1.2;
                    hashMap.put(e.getKey(), value);
                }
            }
            System.out.println("将所有工资低于1000元的员工的工资上涨20%: " + hashMap);
        }
    }
