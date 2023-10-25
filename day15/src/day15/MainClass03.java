package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num=0;
	String s = null;
	
	while(true) {
		System.out.println("수 입력(문자는 안됨, 1입력 종료)");
		try {
			num = input.nextInt();
			System.out.println("출력 : "+num);
		} catch (InputMismatchException e) {
			s = input.nextLine();
			System.err.println(s+" : 잘못 입력 수 입력");
		}
		if(num==1)
			break;
	}
}
}
