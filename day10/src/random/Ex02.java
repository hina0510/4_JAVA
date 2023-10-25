package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ex02 {
public static void main(String[] args) {
	/*System.out.println("======Arraylist======");
	ArrayList arr= new ArrayList();
	for (int i=0;arr.size()<6;i++) {
		int d = (int)(Math.random()*44)+1;
		if (!arr.contains(d)) {
			arr.add(d);
		}
	}
	System.out.println(arr);
	System.out.println("======Hashset======");
	HashSet set = new HashSet();
	for (int i=0;set.size()<6;i++) {
		int d = (int)(Math.random()*44)+1;
		set.add(d);
	}
	System.out.println(set);*/
	System.out.println("======Hashmap======");
	HashMap map = new HashMap();
	for (int i=0;map.size()<6;i++) {
		int d = (int)(Math.random()*44)+1;
		if (!map.containsValue(d)) {
			map.put(i,d);
		}
	}
	System.out.println(map.values());
}
}
