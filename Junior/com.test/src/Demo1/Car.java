package Demo1;

/**
 * ClassName:demo8
 * PackageName:Demo1
 * Description:
 *
 * @date:2022/5/28 11:31
 * @author: wangchunping
 */
public class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
