package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, search;
		String name, phone;
		ArrayList arr = new ArrayList();
		ArrayList arr2 = new ArrayList();
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1: 
				System.out.print("이름 등록 : ");
				name = input.next();
				search = arr.indexOf(name);
				if ( search == -1) {
					System.out.print("연락처 등록 : ");
					phone = input.next();
					arr.add(name);
					arr2.add(phone);
				}else {
					System.out.println("연락처가 있습니다");	
				}
				break;
			case 2: 
				System.out.print("이름 검색: ");
				name = input.next();
				search = arr.indexOf(name);
				if ( search == -1) {
					System.out.println(name+"의 연락처가 없습니다");
				}else {
					System.out.println(arr.get(search));
					System.out.println(arr2.get(search));
				}
				break;
			case 3:
				System.out.print("이름 검색: ");
				name = input.next();
				search = arr.indexOf(name);
				if ( search == -1) {
					System.out.println(name+"의 연락처가 없습니다");
				}else {
					arr.remove(search);
					arr2.remove(search);
				}
				break;
			case 4: 
				for (int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i)+" : "+arr2.get(i));
				}
				break;
			case 5: 
				System.exit(1);
				break;
			}	
		}

	}
}
