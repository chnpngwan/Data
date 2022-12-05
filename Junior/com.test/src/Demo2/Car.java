package Demo2;

/**
 * ClassName:Car
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:29
 * @author: wangchunping
 */
public class Car {
    String name;
    int speed;
    public Car() {
        super();
    }
    public Car(String name, int speed) {
        super();
        this.name = name;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
