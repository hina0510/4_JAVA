package day18;
class A01{
	public void sumFunc(int a, int b) {
		System.out.println(a+b);
	}
	public void sumFunc(double a, double b) {
		System.out.println(a+b);
	}
}
public class MainClass01 {
public static void main(String[] args) {
	A01 a = new A01();
	a.sumFunc(10, 20);
	a.sumFunc(10.11, 20.22);
}
}
