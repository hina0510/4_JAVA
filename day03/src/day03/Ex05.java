package day03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String saveId="1",savePwd="1";
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		
		System.out.println("아이디 입력 : ");
		inputId = input.next();
		
		System.out.println("비밀번호 입력 : ");
		inputPwd = input.next();
		
		if (inputId.equals(saveId)) {
			if(inputPwd.equals(savePwd)) {
				System.out.println("로그인");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("존재하지 않는 아이디입니다");
		}
		input.close();
	}
}
