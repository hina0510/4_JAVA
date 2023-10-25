package day14;
class Calc{
	public void display() {
		System.out.println("계산기");
	}
}
class Computer extends Calc{
	public void print() {
		System.out.println("컴퓨터");
	}
}
public class MainClass01 {
public static void main(String[] args) {
	Calc calc = new Calc();
	calc.display();
	
	Computer com = new Computer();
	com.print();
	com.display();
}
}
