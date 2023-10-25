package day15;

import java.util.Scanner;

class A06{
	public String test() {
		int num=3;
		try {
			int re = 10/num;
			System.out.println("test의 내용들이 실행됩니다");
			return "정상종료";
		} catch (Exception e) {
			return "문제발생";
		}finally {
			System.out.println("무조건 실행되는 코드입니다");
		}
	}
}
public class MainClass06 {
public static void main(String[] args) {
	A06 a = new A06();
	Scanner input = new Scanner(System.in);
	int num;
	while(true) {
		System.out.println("1.test실행");
		System.out.println("2.종료");
		num = input.nextInt();
		if(num == 1) {
			a.test();
		}else {
			break;
		}
	}
}
}
