package day15;
class A08{
	public void test1() {
		System.out.println("test1");
		test2();
	}
	public void test2() {
		System.out.println("test2");
		test3();
	}
	public void test3() {
		System.out.println("test3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MainClass08 {
public static void main(String[] args) {
	A08 a = new A08();
	a.test1();
	System.out.println("main 종료");
}
}
