package javaOOP_03_07;

import java.util.Arrays;

public class Test1 {
	//�пɱ��βεķ���
	//�ɱ����ֻ�ܷ��ڲ�����ĩβ
	//һ��������ֻ�ܴ���һ���ɱ��β�
	public void play(String ... obj) {
		if(obj!=null&&obj.length>0) {
			System.out.println(Arrays.toString(obj));
			for(String s:obj) {
				System.out.println(s);
			}
		}else {
			System.out.println("û�в������ݣ�");
		}
	}
	public void display(String[] obj) {
		if(obj!=null&&obj.length>0) {
			System.out.println(Arrays.toString(obj));
			for(String s:obj) {
				System.out.println(s);
			}
		}else {
			System.out.println("û�в������ݣ�");
		}
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.play();
		t.play("����","����","����","����","����");
		t.play(new String[] {"jack"});
		t.display(new String[] {});
		t.display(new String[] {"����","����","����"});
	}

}
