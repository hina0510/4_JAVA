package day17;

import java.util.ArrayList;

class A04{
	public void test(Object num) {
		System.out.println(num);
	}
}
public class MainClass04 {
public static void main(String[] args) {
	A04 a = new A04();
	a.test("aaaa");
	a.test(1000);
	a.test(1.111);
	
	ArrayList arr = new ArrayList<>();
	arr.add(1000);
	arr.add("aaa");
	
	Object o = 100;
	o = "aaa";
	o = arr;
	o = new MainClass03();
	o = 1.111;
}
}
