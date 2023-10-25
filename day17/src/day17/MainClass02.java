package day17;
class Parents{
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		familyName();
		System.out.println(" 순신");
	}
}
class Daugther extends Parents{
	public void name() {
		familyName();
		System.out.println(" 국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println(" 기광");
	}
}
public class MainClass02 {
public static void main(String[] args) {
	Parents p = new Parents();
	p.name();
	
	Daugther d = new Daugther();
	d.name();
	
	Son s = new Son();
	s.name();
	
	Parents par = new Parents();
	par.name();
	
	par = new Daugther();
	par.name();
	
	par = new Son();
	par.name();
}
}
