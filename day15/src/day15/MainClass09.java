package day15;

import java.util.Scanner;

public class MainClass09 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age = 0;
	
	System.out.println("나이 입력");
	try {
		age = input.nextInt();
		if(age<1) {
			throw new Exception("나이 잘못 입력");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("당신 나이 : "+age);
}
}
