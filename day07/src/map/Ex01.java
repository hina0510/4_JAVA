package map;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		System.out.println(map.get("선풍기"));
		System.out.println(map.containsKey("선풍기"));
		map.replace("선풍기", "변경할 값");
		System.out.println(map);
		map.remove("선풍기");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map);
		

	}
}
