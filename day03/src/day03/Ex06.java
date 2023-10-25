package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/*
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if (num>100) {
			System.out.println("100 보다 크다");
		}else if(num>80) {
			System.out.println("80 보다 크다");
		}else if(num>60) {
			System.out.println("60 보다 크다");
		}else {
			System.out.println("else 실행");
		}
		*/
		int su;
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		su = input.nextInt();
		if (su==0) {
			System.out.println("잘못 입력");
		}else if (su%3==0 && su%4==0) {
			System.out.println("3의 배수이며 4의 배수");
		}else if (su%3==0) {
			System.out.println("3의 배수만 해당");
		}else if (su%4==0) {
			System.out.println("4의 배수만 해당");
		}else {
			System.out.println("3의 배수도 4의 배수도 아님");
		}
		input.close();
	}
}
