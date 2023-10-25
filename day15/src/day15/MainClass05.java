package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	try {
		System.out.println("수 입력");
		int num = new Scanner(System.in).nextInt();
		System.out.println(10/num);
		
		int [] arr = {11,22};
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
	} catch (InputMismatchException e) {
		System.out.println("문제 발생");
	}catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없음");
	}catch (Exception e) {
		System.out.println("index범위 벗어남");
	}
	System.out.println("==================");
	try {
		System.out.println("수 입력 : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(10/num);
		
		int [] arr = {11,22};
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
	} catch (Exception e) {
		System.out.println("문제 발생");
		e.printStackTrace();
	}
	System.out.println("다음 문장들 실행");
}
}
