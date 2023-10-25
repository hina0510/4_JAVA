package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add("라면");hs.add("김밥");
	hs.add("라면");hs.add("순대");
	hs.remove("라면");
	System.out.println("set : "+hs);
	
	ArrayList arr = new ArrayList();
	arr.add("라면");arr.add("김밥");
	arr.add("라면");arr.add("순대");
	System.out.println("arr : "+arr);
}
}
