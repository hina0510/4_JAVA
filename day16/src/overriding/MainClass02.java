package overriding;
class A02{
	public void a02() {
		System.out.println("a02 실행");
	}
}
class B02 extends A02{
	public void b02() {
		System.out.println("b02 실행");
	}
	public void a02() {
		System.out.println("자식에서 a02 실행");
	}
}
public class MainClass02 {
public static void main(String[] args) {
	B02 b = new B02();
	b.a02();
	b.b02();
}
}
