package day18;

import java.util.ArrayList;

class StInfo{
	private String name, phNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
}
public class MainClass05 {
public static void main(String[] args) {
	ArrayList<StInfo> arr = new ArrayList<>();
	
	StInfo s01 = new StInfo();
	s01.setName("홍길동");
	s01.setPhNum("010");
	/*System.out.println("s01 : "+s01.getName());
	System.out.println("s01 : "+s01.getPhNum());*/
	
	arr.add(s01);
	StInfo si = arr.get(0);
	System.out.println(si.getName());//변수를 사용해서
	System.out.println(si.getPhNum());
	System.out.println("============");
	System.out.println(arr.get(0).getName());//변수 없이 
	System.out.println(arr.get(0).getPhNum());
	
	System.out.println("============");
	StInfo ss = new StInfo();
	ss.setName("김개똥");
	ss.setPhNum("1111");
	arr.add(ss);
	System.out.println(arr.get(0).getName());
	System.out.println(arr.get(0).getPhNum());
	System.out.println(arr.get(1).getName());
	System.out.println(arr.get(1).getPhNum());
	
	System.out.println("===== for ====");
	for(int i=0;i<arr.size();i++) {
		StInfo s = arr.get(i);
		System.out.println("이름 : "+s.getName());
		System.out.println("전번 : "+s.getPhNum());
		System.out.println("============");
	}
	
	int[] a = {11,22,33};
	for(int num : a) {
		System.out.println(num);
	}
	System.out.println("============");
	System.out.println("for each");
	for(StInfo ar : arr) {
		System.out.println(ar.getName());
		System.out.println(ar.getPhNum());
		System.out.println("============");
	}
}
}
