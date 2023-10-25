package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		
		it = hs.iterator();
		//Object s = it.next();
		//String ss = (String)s;
		String ss = (String)it.next();
		
		//System.out.println("s : "+s);
		System.out.println("ss : "+ss);
	}
}
