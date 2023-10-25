package day03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*int num = 10;
		if (num % 2 == 0) {
			System.out.println(num+" 짝수");
		}else {
			System.out.println(num+" 홀수");
		}
		System.out.println("다음문장 실행");
		*/
		int su;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		su = input.nextInt();
		if (0<su && su<100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		input.close();
}
}
