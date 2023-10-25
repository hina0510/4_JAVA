package array_01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String str[] = new String[5];
		String str2[] = {"안녕", "하세"};
		System.out.println("str : "+str.length);
		System.out.println("str2 : "+str2.length);
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		str[2] = input.next();
		System.out.println("str 0 : "+str[0]);
		System.out.println("str 1 : "+str[1]);
		System.out.println("str 2 : "+str[2]);
		System.out.println("str 3 : "+str[3]);
		System.out.println("str 4 : "+str[4]);
		
		for (int i=0;i<str.length;i++) {
			System.out.println(i+"번째 입력 : "+str[i]);
			str[i] = input.next();
		}
		for (int i=0;i<str.length;i++) {
			System.out.println(i+". "+str[i]);
		}
		input.close();
	}
}
