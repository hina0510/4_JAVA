package day14;
class A04{
	public A04(int a) {
		System.out.println("부모 매개변수 받는 생성자");
	}
	public A04() {
		System.out.println("그냥 부모 생성자");
	}
}
class B04 extends A04{
	public B04() {
		System.out.println("자식 생성자");
	}
}
public class MainClass04 {
public static void main(String[] args) {
	B04 b = new B04();
}
}
