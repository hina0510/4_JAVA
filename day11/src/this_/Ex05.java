package this_;

import java.util.Scanner;

public class Ex05 {
	private DTO05 dto = new DTO05();
	String id=null, pw=null;
	String nid=null, npw=null;
	public void login() {
		Scanner input = new Scanner(System.in);
		System.out.print("ID : ");
		nid = input.next();
		System.out.print("PW : ");
		npw = input.next();
		if (nid.equals(id)) {
			if (npw.equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("PW 다름");
			}
		}else {
			System.out.println("ID 다름");
		}
	}
	public void save() {
		this.id = dto.getId();
		this.pw = dto.getPass();
	}
}
