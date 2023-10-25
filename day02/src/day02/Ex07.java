package day02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("1. 쉬운게임 2. 어려운게임");
		num = input.nextInt();
		if (num==1) {
			System.out.println("쉬운게임 실행");
		}
		if (num==2) {
			System.out.println("어려운게임 실행");
		}
		input.close();
	}
}
