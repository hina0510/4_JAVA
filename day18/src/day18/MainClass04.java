package day18;

import java.util.ArrayList;

class A04{
	
}
public class MainClass04 {
public static void main(String[] args) {
	ArrayList<A04> arr = new ArrayList<>();
	A04 a = new A04();//로그인 정보 저장할 때 따로 만들지 않고 클래스 자체를 ArrayList로 만듬
	arr.add(a);
	A04 n = arr.get(0);
}
}
