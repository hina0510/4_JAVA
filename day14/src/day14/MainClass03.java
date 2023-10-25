package day14;
class A03{
	public A03(String msg) {
		System.out.println("a03 부모 생성자 : "+msg);
	}
}
class B03 extends A03{
	public B03() {
		super("값전달");
		System.out.println("자식 생성자 실행");
	}
	public B03(String m) {
		super(m);
	}
}
public class MainClass03 {
public static void main(String[] args) {
	//A03 a = new A03("안녕하세요");
	B03 b = new B03();
	B03 bb = new B03("메인에서 전달");
}
}
