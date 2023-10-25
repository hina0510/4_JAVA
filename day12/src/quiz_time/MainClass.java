package quiz_time;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	TimeService ts = new TimeService();
	TimeDTO td = new TimeDTO();
	int num, start = 0, end = 0;
	while(true) {
		System.out.println("1. 시작");
		System.out.println("2. 종료");
		System.out.println("3. 사용시간 확인");
		System.out.print(">>>");
		num = input.nextInt();
		switch(num) {
		case 1 : 
			start = td.startTime();
			System.out.println(start);
			break;
		case 2 : 
			end = td.startTime();
			System.out.println(end);
			break;
		case 3 : 
			ts.time(start, end);
			break;
		}
	}
}
}
