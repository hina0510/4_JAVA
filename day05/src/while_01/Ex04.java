package while_01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0, sum=0;
		/*
		while(true) {
			System.out.println("수 입력 : ");
			num = input.nextInt();
			if(num>=10 && num<=20) {
				break;
			}
			System.out.println("다시 입력");
		}
		
		while(true) {
			System.out.println("수 입력 : ");
			num = input.nextInt();
			if(num < 10 || num > 20) {
				System.out.println("다시 입력");
				continue;
			}
			break;
		}
		System.out.println("num : "+num);
		*/
		System.out.println("수 입력 : ");
		num = input.nextInt();
		for(int i=1; i<=num;i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 값 : "+sum);
		input.close();
	}
}
