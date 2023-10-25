package overriding;

import java.util.ArrayList;

class A03 extends ArrayList{
	Object[] obj = new Object[3];
	public boolean add(Object o) {
		System.out.println("내가 가지고 있는 add실행");
		obj[0]=o;
		return true;
	}
	public Object get(int index) {
		System.out.println("내가 만든 get 실행");
		return obj[0];
	}
}
public class MainClass03 {
public static void main(String[] args) {
	A03 a = new A03();
	a.add("11111");
	System.out.println(a.get(0));
}
}
