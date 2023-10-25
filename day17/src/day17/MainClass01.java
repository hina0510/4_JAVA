package day17;
class A01{
	public void test() {
		System.out.println("aaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbb");
	}
}
class C01 extends A01{
	public void test() {
		System.out.println("cccc");
	}
}
public class MainClass01 {
public static void main(String[] args) {
	B01 b = new B01();
	b.test();
	C01 c = new C01();
	c.test();
	
	A01 a01;
	a01 = new B01();
	a01.test();
	a01 = new C01();
	a01.test();
}
}
