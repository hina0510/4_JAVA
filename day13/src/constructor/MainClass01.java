package constructor;

public class MainClass01 {
public static void main(String[] args) {
	TestClass01 t = new TestClass01();
	TestClass01 t2 = new TestClass01("초기화 해주세요");
	
	String s = new String();
	String s2 = new String("안녕하세요");
	System.out.println("s : "+s);
	System.out.println("s2 : "+s2);
}
}
