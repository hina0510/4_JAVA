package switch0;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("문자열 입력 : ");
		str = input.next();
		System.out.println("안녕".equals(str));
		if("안녕".equals(str)) {
			System.out.println("두 값은 같다");
		}else{
			System.out.println("다르다");
		}
		input.close();
	}
}
