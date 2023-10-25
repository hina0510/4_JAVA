package variable;
class Test01{
	public int test01() {
		int num=100;
		System.out.println("test01 : "+num);
		//test02(num);
		return num;
	}
	public void test02(int num) {
		System.out.println("test02 : "+num);
	}
}
public class Ex01 {
public static void main(String[] args) {
	Test01 t = new Test01();
	int n = t.test01();
	t.test02(n);//t.test02(t.test01());
	int num=100;
	if (true) {
		int test=1000;
		System.out.println(test);
		num=200;
	}
	System.out.println(num);
}
}
