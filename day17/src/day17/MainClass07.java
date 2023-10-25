package day17;
class A군07{
	public void 공격() {
		System.out.println("공격합니다");
	}
	public void 방어() {
		System.out.println("방어합니다");
	}
}

class B군07{
	public void 공군공격() {
		System.out.println("비행기가 공격합니다");
	}
	public void 미사일장착() {
		System.out.println("미사일 장착합니다");
	}
	public void 연료채움() {}
	public void 공격할까말까() {}
}
public class MainClass07 {
public static void main(String[] args) {
	A군07 a = new A군07();
	B군07 b = new B군07();
	
	a.공격();
	a.방어();
	
	b.공군공격();
	b.미사일장착();
	b.연료채움();
	b.공격할까말까();
}
}
