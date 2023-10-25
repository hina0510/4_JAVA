package this_;

import java.util.Scanner;

public class DTO04 {
	Scanner input = new Scanner(System.in);
	String name;
	int age;
	public void setName(String name) {
		System.out.println("이름 : "+name);
	}
	public String getName() {
		System.out.print("이름 출력 : ");
		name = input.next();
		return name;
	}
	public void setAge(int age) {
		System.out.println("나이 : "+age);
	}
	public int getAge() {
		System.out.print("나이 출력 : ");
		age = input.nextInt();
		return age;
	}

}
