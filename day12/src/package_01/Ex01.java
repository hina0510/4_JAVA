package package_01;

import package_02.*;// *은 파일 속 전체

public class Ex01 {
public static void main(String[] args) {
	Ex02 e = new Ex02();
	e.test();
	e.test2();
	
	Exxx01 ee = new Exxx01();
	ee.test();
	
	Exxx02 e2 = new Exxx02();
	Exxx03 e3 = new Exxx03();
}
}