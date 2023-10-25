package day08;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력 : ");
		n1 = input.nextInt();
		System.out.println("수 입력 : ");
		n2 = input.nextInt();
		sum = n1+n2;
		System.out.println("두 수 합 : "+sum);
	}
}
