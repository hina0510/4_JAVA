package constructor;

import java.util.ArrayList;

class TestClass03{
	int num;
	public TestClass03() {
		
	}
}
public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t01 = new TestClass03();
	TestClass03 t02 = new TestClass03();
	TestClass03 t03 = new TestClass03();
	t01.num = 100;
	t02.num = 200;
	t03.num = 300;
	System.out.println(t01.num);
	System.out.println(t02.num);
	System.out.println(t03.num);
	
	/*ArrayList arr = new ArrayList();
	for (int i=0;i<10;i++) {
		TestClass03 t = new TestClass03() {
			arr.add(t);
		}
		System.out.println(arr);
	}*/
}
}
