package javaOOP_01_03_21_02;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		p.say(19);
		p.say("张三");
		p.say(20, "李四");
		p.say("王五", 18);
		p.say("赵六", "男");
	}

}
