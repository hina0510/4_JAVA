package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap menu = new HashMap();
		Scanner input = new Scanner(System.in);
		int num;
		String name, pri;
		
		while(true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch (num) {
			case 1: 
				System.out.println("메뉴 등록 : ");
				name = input.next();
				if (menu.containsKey(name)==true) {
					System.out.println("존재하는 메뉴입니다");
				}else {
					System.out.println("가격 등록 : ");
					pri = input.next();
					menu.put(name, pri);
				}
				break;
			case 2: 
				Set s = menu.keySet();
				Iterator it = s.iterator();
				while(it.hasNext()) {
					String msg = (String)it.next();
					System.out.println(msg+" : "+menu.get(msg));
				}
				
				while(true) {
					System.out.println("1. 수정");
					System.out.println("2. 삭제");
					System.out.println("3. 나가기");
					System.out.println(">>>");
					num = input.nextInt();
					
					if (num==1) {
						System.out.println("메뉴 입력 : ");
						name = input.next();
						if (menu.containsKey(name)==true) {
							System.out.println("가격 등록 : ");
							pri = input.next();
							menu.replace(name, pri);
						}else {
							System.out.println("메뉴가 없습니다");
						}
					}else if (num==2){
						System.out.println("메뉴 입력 : ");
						name = input.next();
						if (menu.containsKey(name)==true) {
							menu.remove(name);
						}else {
							System.out.println("메뉴가 없습니다");
						}
					}else if(num==3){
						break;
					}
				}
			case 3: 
				System.exit(1);
			}
		}

	}
}
