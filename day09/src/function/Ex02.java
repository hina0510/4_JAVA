package function;

import java.util.Scanner;

class Input{
	public int input() {
		Scanner input = new Scanner(System.in);
		int n1;
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		return n1;
	}
}

class Print1{
	public void print(int n1) {
		if (n1%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}

class Print2{
	public void print(int n1) {
		if (n1%3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
	}
}

class Print3{
	public void print(int n1) {
		int sum=0;
		for(int i=1;i<=n1;i++) {
			if (n1%i==0) {
				sum+=i;
			}
		}
			if(sum==n1+1) {
				System.out.println("소수");
			}else {
				System.out.println("소수 아님");
			}
	}
}

class Print4{
	public void print(int n1) {
		if (n1>0) {
			System.out.println(n1);
		}else {
			System.out.println(-n1);
		}
	}
}

public class Ex02 {
public static void main(String[] args) {
	int n1, num;
	Scanner input = new Scanner(System.in);
	while(true) {
		Input i = new Input();
		Print1 p1 = new Print1();
		Print2 p2 = new Print2();
		Print3 p3 = new Print3();
		Print4 p4 = new Print4();
		
		System.out.println("1. 홀짝");
		System.out.println("2. 3의 배수");
		System.out.println("3. 소수");
		System.out.println("4. 절대값");
		System.out.print(">>>");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			n1 = i.input();
			p1.print(n1);
			break;
		case 2:
			n1 = i.input();
			p2.print(n1);
		break;
		case 3:
			n1 = i.input();
			p3.print(n1);
			break;
		case 4:
			n1 = i.input();
			p4.print(n1);
			break;
		}
	}
}
}
