package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		String key=null, value=null;
		
		map.put("선풍기", "100만원");
		map.put("에어컨", "200만원");
		map.put("자동차", "300만원");
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println(i+"번째 key 입력 : ");
			key = input.next();
			System.out.println(i+"번째 value 입력 : ");
			value = input.next();
			map.put(key, value);
		}
		
		System.out.println(map.keySet());
		
		Set s = map.keySet();
		
		HashSet set = new HashSet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			String msg = (String)it.next();
			System.out.println(msg);
		}
	}
}
