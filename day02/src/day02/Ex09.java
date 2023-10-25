package day02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int su1 = 0, su2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("두 수 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		if (su1>su2) {
			System.out.println("큰 수 : "+su1);
		}
		if (su2>su1) {
			System.out.println("큰 수 : "+su2);
		}
		input.close();
	}
}
