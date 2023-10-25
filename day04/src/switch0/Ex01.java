package switch0;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		switch(num) {
		case 1:System.out.println("1입력"); break;
		case 2:System.out.println("2입력"); break;
		default:System.out.println("1,2를 제외한 다른값");
		}
		input.close();
	}
}
