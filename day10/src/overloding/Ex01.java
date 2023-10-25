package overloding;

import java.util.ArrayList;

class Test01{
	public void sumFunc(int num1) {
		System.out.println(num1);
	}
	public void sumFunc(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void sumFunc(double do01, double do02) {
		System.out.println(do01+do02);
	}
	public void sumFunc(String s1, String s2) {
		System.out.println(s1+s2);
	}
}
public class Ex01 {
public static void main(String[] args) {
	int num1=10, num2=20;
	Test01 t = new Test01();
	t.sumFunc(num1, num2);
	
	double do01=1.11, do02=2.22;
	t.sumFunc(do01, do02);
	
	String s1="test", s2="func";
	t.sumFunc(s1, s2);
	t.sumFunc(100);
}
}
