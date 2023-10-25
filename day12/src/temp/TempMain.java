package temp;

import java.util.Scanner;

public class TempMain {
public static void main(String[] args) {
	int num;
	TempDTO td = new TempDTO();
	Scanner input = new Scanner(System.in);
	while(true) {
		System.out.println("1. 온도 올리기");
		System.out.println("2. 온도 내리기");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1:
			td.getUpTemp();
			break;
		case 2:
			td.getDownTemp();
			break;
		}
	}
	
}
}
