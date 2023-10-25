package day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력 : ");
		n1 = input.nextInt();
		System.out.println("수 입력 : ");
		n2 = input.nextInt();
		TestClass05 t = new TestClass05();
		t.sumFunc(n1, n2);

	}
}
