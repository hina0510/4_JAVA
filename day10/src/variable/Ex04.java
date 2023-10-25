package variable;
class Test04{
	public static int num;
	static{num = 1000;}
	public void test() {
		System.out.println(num);
	}
	int n = 1000;
	public static void test02() {
		System.out.println("test02");
	}
}
public class Ex04 {
	static int num=1234;
	public static void main(String[] args) {
		Test04.test02();
	System.out.println(Test04.num);
	}
	public void test() {
		System.out.println("test");
	}
}
