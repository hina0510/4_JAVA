package constructor;
class TestClass04{
	int num;
	private static TestClass04 t;
	private TestClass04() {
		
	}
	public static TestClass04 getInstance() {
		System.out.println("t : "+t);
		if(t==null)
			t = new TestClass04();
		return t;
	}
}
public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t01 = TestClass04.getInstance();
	TestClass04 t02 = TestClass04.getInstance();
	System.out.println(t01);
	System.out.println(t02);
}
}
