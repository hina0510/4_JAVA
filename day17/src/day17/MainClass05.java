package day17;
abstract class A05{
	public void aaa() {
		System.out.println("부모 기능");
	}
	public abstract void test();
}
class B05 extends A05{
	public void bbb() {
		System.out.println("bbb기능");
	}
	public void test() {
		System.out.println("자식");
	}
}
public class MainClass05 {
public static void main(String[] args) {
	B05 b = new B05();
	b.aaa();
	b.test();
}
}
