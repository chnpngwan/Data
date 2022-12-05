package text;

public class OrderTest {
	public static void main(String[] args) {
		OrderA orderA=new OrderA();
		orderA.setName("a");
		OrderB orderb=new OrderB(orderA);
		orderb.setName("b");
		orderA.start();
		orderb.start();
	}
}
