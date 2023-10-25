package day08;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력 : ");
		n1 = input.nextInt();
		System.out.println("수 입력 : ");
		n2 = input.nextInt();
		TestClass06 t = new TestClass06();
		sum = t.sumFunc(n1, n2);
		System.out.println("두 수 합 : "+sum);
	}
}
