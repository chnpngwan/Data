package Demo2;

import Demo1.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Work5
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:28
 * @author: wangchunping
 */
/*
 * 7.实现以下功能：
	1 ）封装一个汽车类，包含String  name、int  speed属性，在测试类中实例化
	      三个对象：c1，c2，c3，分别设置name为：“奥拓”，“宝马”，“奔驰”，
	      速度分别设置为：100,200,300
	2 ）使用Map集合对象m1将这三个汽车类对象保存成key，然后将int型的汽车
	      价钱作为值保存在m1的value中，上述三款汽车分别对应的价钱是10000,500000,2000000
	3 ）遍历m1的键，打印name属性
	4 ）通过合适的方法，求出m1中“宝马”的价格，并打印结果；
	5 ）经过折旧，所有汽车都降价到原来的80%，请打印降价后“宝马”的价格
 */
public class Cartest {
    public static void main(String[] args) {
        //实例化三个对象：c1，c2，c3
        Car c1 = new Car("奥拓",100);
        Car c2 = new Car("宝马",200);
        Car c3 = new Car("奔驰",300);

        //使用Map集合对象m1将这三个汽车类对象保存成key，然后将int型的汽车价钱作为值保存在m1的value中
        Map<Car,Integer> hashMap = new HashMap<Car, Integer>();
        hashMap.put(c1, 10000);
        hashMap.put(c2, 500000);
        hashMap.put(c3, 2000000);

        //遍历m1的键，打印name属性
        Set<Car> keys = hashMap.keySet();
        for(Car key:keys) {
            System.out.println(key.getName());
        }

        //通过合适的方法，求出m1中“宝马”的价格，并打印结果；
        for(Car key:keys) {
            if(key.getName().equals("宝马")) {
                System.out.println(key.getName() + "：" + hashMap.get(key));
            }
        }

        //经过折旧，所有汽车都降价到原来的80%，请打印降价后“宝马”的价格
        for(Car key:keys) {
            int value = (int)(hashMap.get(key)*0.8);
            hashMap.put(key, value);
            if(key.getName().equals("宝马")) {
                System.out.println(key.getName() + "：" + hashMap.get(key));
            }
        }

    }
}
