package this_;

import java.util.Scanner;

public class DTO05 {
	Scanner input = new Scanner(System.in);
	String id, pw;
	public String getId() {
		System.out.print("ID : ");
		id = input.next();
		return id;
	}
	public String getPass() {
		System.out.print("PW : ");
		pw = input.next();
		return pw;
	}
}
