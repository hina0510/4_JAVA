package switch0;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		String home=null;
		String work=null;

		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.print(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("우리집 목적지 입력 : ");
				home = input.next();
				break;
			case 2:
				System.out.print("회사 목적지 입력 : ");
				work = input.next();
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+work);
				break;
			}
			input.close();
		}
	}
}
