package day17;
class A03{
	public void test() {
		System.out.println("부모");
	}
}
class B03 extends A03{
	public void bbb() {
		System.out.println("bbb");
	}
	public void test() {
		System.out.println("자식");
	}
}
public class MainClass03 {
public static void main(String[] args) {
	B03 b = new B03();
	b.bbb();
	b.test();
	
	A03 a = new B03();
	a.test();
	
	B03 bb = (B03)a;
	bb.bbb();
}
}
