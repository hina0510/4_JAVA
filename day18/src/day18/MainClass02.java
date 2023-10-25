package day18;

class A02<T>{
	public void sumFunc(T a, T b) {
		System.out.println(a+", "+b);
	}
}

public class MainClass02 {
public static void main(String[] args) {
	A02<String> a = new A02<>();
	a.sumFunc("aaa", "bbb");
	
	A02<Integer> b = new A02<>();
	b.sumFunc(100, 200);
	
}
}
