package day02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String name = null;
		int kor = 0, eng = 0, math = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("국어 입력 : ");
		kor = input.nextInt();
		System.out.print("영어 입력 : ");
		eng = input.nextInt();
		System.out.print("수학 입력 : ");
		math = input.nextInt();
		
		System.out.println("=======================");
		System.out.println("이 름 : "+name);
		System.out.println("=======================");
		System.out.println("국 어 : "+kor);
		System.out.println("영 어 : "+eng);
		System.out.println("수 학 : "+math);
		System.out.println("=======================");
		System.out.println("합 계 : "+(kor+eng+math));
		System.out.println("=======================");
		input.close();
	}
}
