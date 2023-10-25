package variable;
class Test02{
	int cnt;
	int num;
	public void test01() {
		num=100;
		System.out.println("test01 : "+num);
		System.out.println(cnt);
	}
	public void test02() {
		System.out.println("test02 : "+num);
		System.out.println(cnt);
	}
}
public class Ex02 {
public static void main(String[] args) {
	Test02 t = new Test02();
	t.cnt=1234;
	t.test01();
	t.test02();
}
}
