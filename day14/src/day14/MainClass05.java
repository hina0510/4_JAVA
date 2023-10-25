package day14;
class A05{
	public void a05() {
		System.out.println("부모 메소드 실행");
	}
}
class B05 extends A05{
	public void b05() {
		System.out.println("자식 메소드 실행");
		a05();
	}
	public void a05() {
		System.out.println("자식에 있는 a 메소드 실행");
	}
}
public class MainClass05 {
public static void main(String[] args) {
	B05 b = new B05();
	b.b05();
}
}
