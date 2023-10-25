package day15;

import java.util.Scanner;

public class MainClass02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x, y, result=0;
	System.out.print("수 입력 : ");
	x = input.nextInt();
	y = input.nextInt();
	try {
		result = x / y;
		System.out.println("x / y = "+result);
	} catch (Exception e) {
		System.out.println("0으로 나눌 수 없습니다");
	}
	System.out.println("다음 문장들은 중요한 내용으로 실행되야 합니다");
}
}
