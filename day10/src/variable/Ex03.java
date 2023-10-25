package variable;
class Test03{
	private int age;
	public void input() {
		age = 20;
	}
	public void 만으로변경() {
		age = age-1;
	}
	public void 출력() {
		System.out.println("age : "+age);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.input();
		t.만으로변경();
		t.출력();
	}
}
