package this_;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Ex05 e = new Ex05();
	int num;
	Scanner input = new Scanner(System.in);
	
	while (true) {
		System.out.println("1. save");
		System.out.println("2. login");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1:
			e.save();
			break;
		case 2:
			e.login();
			break;
		}
	}
}
}
