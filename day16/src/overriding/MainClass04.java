package overriding;
final class A04{
	public void a04(){
		System.out.println("부모 실행");
	}
}
class B04{
	A04 a = new A04();
	public void a04(){
		a.a04();
		System.out.println("자식 실행");
	}
}
public class MainClass04 {
public static void main(String[] args) {
	B04 b = new B04();
	b.a04();
}
}
