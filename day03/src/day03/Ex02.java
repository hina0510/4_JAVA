package day03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		if (num>10)
			System.out.println("종속문장 실행");
		System.out.println("다음문장 실행");
		sc.close();
	}
}
