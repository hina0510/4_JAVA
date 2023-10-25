package array_list;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("안녕");
		arr.add("하이");
		arr.add("봉주르");
		arr.add("니하오");
		System.out.println(arr);
		int num = arr.indexOf("하이");
		System.out.println(arr.indexOf("하이~"));
		arr.set(num, arr);
		

	}
}
