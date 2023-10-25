package quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	win10DTO dto = new win10DTO();
	HashMap info = new HashMap();
	
	info.put("메모리", "16GB");
	info.put("시스템", "64bit");

	String calc = "calc", notepad = "notepad";
	String msg = null;
	
	while(true) {
		int num;
		System.out.println("1. 성능");
		System.out.println("2. 기능 사용");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1 : 
			Iterator it = info.keySet().iterator();
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key+" : "+info.get(key));
			}
			break;
		case 2 :
			ProcessBuilder pro = new ProcessBuilder();
			
			System.out.println("1. 계산기");
			System.out.println("2. 메모장");
			System.out.println("3. 직접입력");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1 : 
				pro.command(calc);
				try {
					pro.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2 : 
				pro.command(notepad);
				try {
					pro.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3 : 
				System.out.print("입력 : ");
				msg = input.next();
				pro.command(msg);
				try {
					pro.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			break;
		}
	}
}
}
