package day17;
interface Test10{
	public final static String name="홍길동1";
	public static String name1="홍길동2";
	public final String name2="홍길동3";
	public String name3="홍길동4";//4개 다 같음(final과 static 생략가능)
	
	public void test();
}
class A10{
	
	public final static String name="김개똥1";
	public static String name2="김개똥2";//2개 다 같음(final 생략가능)
}
public class MainClass10 {
public static void main(String[] args) {
	System.out.println(A10.name);
	System.out.println(Test10.name);
}
}
