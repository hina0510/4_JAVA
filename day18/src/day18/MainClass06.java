package day18;

class A06{
	public void test() {
		System.out.println("부모");
	}
}
class B06 extends A06{
	public int age;
	private String name;
	public void test(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("내가 원하는대로 변경");
	}
	public String toString() {
		return "B06["+age+", "+name+" ]";
	}
}

public class MainClass06 {
public static void main(String[] args) {
	B06 b = new B06();
	b.test(20, "홍길동");
	System.out.println(b);
	System.out.println(b.toString());
	
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(111);
	arr.add(222);
	arr.add(333);
	
	System.out.println(arr);
	System.out.println(arr.toString());
}
}
