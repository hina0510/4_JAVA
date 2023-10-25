package day17;

import java.util.Scanner;

interface Unit09{
	public void attack();
	public void defense();
}
class A지상군09 implements Unit09{
	public void attack() {
		System.out.println("지상군 공격합니다");
	}
	public void defense() {
		System.out.println("지상군 방어합니다");
	}
}
class B공군09 implements Unit09{
	public void attack() {
		System.out.println("공군 공격합니다");
	}
	public void defense() {
		System.out.println("공군 방어합니다");
	}
}
public class MainClass09 {
public static void main(String[] args) {
	Unit09 u;
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("적이 처들어왔습니다");
	System.out.println("1.지상군 2.공군");
	num = input.nextInt();
	if(num==1) {
		u=new A지상군09();
		System.out.println("지상군 선택");
	}else {
			u=new B공군09();
			System.out.println("공군 선택");
	}
	System.out.println("1.방어 2.공격");
	int choice = input.nextInt();
	if(choice==1) {
		u.defense();
	}else {
		u.attack();
	}
	
	
}
}
