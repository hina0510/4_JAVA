package this_;

public class Ex02 {
	private int num;
	public void test02() {
		System.out.println("test02 : "+num);
		System.out.println("02 this : "+this.num);
	}
	public void test01() {
		int num = 100;
		this.num = 555;
		System.out.println("01 this : "+this.num);
		System.out.println("test01 : "+num);
	}
}
