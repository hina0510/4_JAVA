package day18;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass03 {
public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();
	
	arr.add(100);
	
	int n = arr.get(0)+100;
	System.out.println(n);
	
	HashMap<String, String> map = new HashMap<>();
	map.put("key", "값이 나옵니다");
	String s = map.get("key")+100;
	System.out.println(s);
	
}
}
