package day17;
interface Unit08{
	public void attack();
	public void defense();
}
class A지상군08 implements Unit08{
	public void 방아쇠를당김() {
		System.out.println("방아세를 당김");
	}
	public void 총알장전() {
		System.out.println("총알 장전!");
	}
	public void attack() {
		System.out.println("지상군이 공격합니다");
	}
	public void attack1() {
		System.out.println("지상군이 공격 할까 말까");
	}
	public void defense() {}
}
public class MainClass08 {
public static void main(String[] args) {
	Unit08 u = new A지상군08();
	u.attack();
}
}
