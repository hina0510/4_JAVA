package array_list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		System.out.println("size : "+arr.size());
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		System.out.println("size : "+arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		arr.remove(1);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		arr.clear();
		System.out.println("size : "+arr.size());
	}
}
