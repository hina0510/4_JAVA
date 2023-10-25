package day14;
class A06{
	public String str;
	protected String msg = "메세지";
	public A06() {
		str = "부모 문자열";
	}
}
class B06 extends A06{
	private String str;
	public B06() {
		str = "자식 문자열";
	}
	public void test() {
		System.out.println(this.str);
		System.out.println(super.str);
		System.out.println(msg);
	}
}
public class MainClass06 {
public static void main(String[] args) {
	B06 b = new B06();
	b.test();
}
}
