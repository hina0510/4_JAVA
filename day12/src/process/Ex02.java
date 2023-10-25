package process;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	ProcessBuilder pro = new ProcessBuilder();
	Scanner input = new Scanner(System.in);
	int num;
	String msg = null;
	String[]excute = {"calc", "notepad"};
	while(true) {
		System.out.println("1. 계산기");
		System.out.println("2. 메모장");
		System.out.println("3. 직접입력");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1:
			pro.command(excute[0]);
			try {
				pro.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break; 
		case 2:
			pro.command(excute[1]);
			try {
				pro.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break; 
		case 3:
			System.out.print(">>>");
			msg = input.next();
			pro.command(msg);
			try {
				pro.start();
			} catch (IOException e) {
				e.printStackTrace();
				//System.err.println(msg+" : 존재하지 않는 명령어 입니다.");
			}
			break; 
	}
	
}
}
}
