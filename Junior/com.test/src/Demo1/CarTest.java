package Demo1;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/**
 * ClassName:CarTest
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:36
 * @author: wangchunping
 */
public class CarTest {
    public static void main(String[] args) {
        Set set=new HashSet();
        Car car1=new Car("奔驰",89000);
        Car car2=new Car("悍马",890000);
        Car car3=new Car("野马",230000);
        Car car4=new Car("宝马",340000);
        Car car5=new Car("宝马",560000);
        set.add(car1);
        set.add(car2);
        set.add(car3);
        set.add(car4);
        set.add(car5);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Car car=(Car) iterator.next();
            System.out.println(car);
            System.out.println("降价"+(car.getPrice()-1000));
        }
    }
}
