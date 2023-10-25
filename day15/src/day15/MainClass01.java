package day15;
class AAA{
	
}
class BBB extends AAA{
	
}
class CCC extends AAA{
	
}
public class MainClass01 {
	public static void main(String[] args) {
		BBB b = new BBB();
		AAA a = new BBB();
		CCC c = new CCC();
		AAA aa = new CCC();
	}
	
}
