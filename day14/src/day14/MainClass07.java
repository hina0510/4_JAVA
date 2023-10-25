package day14;
class A07{
	public void aaa() {
		System.out.println("a메소드");
	}
}
class B07 extends A07{
	public void bbb() {
		System.out.println("b메소드");
	}
}
class C07 extends B07{
	public void ccc() {
		System.out.println("c메소드");
	}
}
public class MainClass07 {
public static void main(String[] args) {
	C07 c = new C07();
	c.aaa();
	c.bbb();
	c.ccc();
}
}
