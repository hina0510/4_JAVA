package day02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int num = 0, su = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		num=input.nextInt();
		su = num % 2;
		if (su==0) {
			System.out.println("짝수");
		}
		if (su==1) {
			System.out.println("홀수");
		}
		input.close();
	}

}
