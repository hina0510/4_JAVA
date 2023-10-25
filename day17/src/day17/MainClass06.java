package day17;
class A06{
	public void aaa() {
		System.out.println("어떤 기능들이 있습니다");
	}
}
class B06 extends A06 implements Inte06{
	public void test() {
		System.out.println("gggg");
	}
}
public class MainClass06 {
public static void main(String[] args) {
	B06 b = new B06();
}
}
