package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, su3, max=0;
		System.out.println("세 수 입력 : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		su3 = sc.nextInt();
		if (su1>su2 && su1>su3)
			max = su1;
		if (su1>su2 && su1<su3)
			max = su3;
		if (su1<su2 && su2>su3)
			max = su2;
		if (su1<su2 && su2<su3)
			max = su3;
		System.out.println("큰 수 : "+max);
		System.out.println("=============");
		int num1, num2;
		System.out.println("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1>num2 && num1%2==0)
			System.out.println(num1+" : 큰 수, 짝수");
		if (num1<num2 && num2%2==0)
			System.out.println(num2+" : 큰 수, 짝수");
		sc.close();
	}
}
