package overriding;
class Ferrari01{
	private int ye;
	public Ferrari01(int ye) {
		this.ye=ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(getYe()+"년식 페라리 속도 300km");
	}
}
class NewFerrari extends Ferrari01{
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드를 시작합니다");
	}
	public void speed() {
		System.out.println(getYe()+"년식 500km까지 달립니다");
	}
}
public class MainClass01 {
public static void main(String[] args) {
	NewFerrari n = new NewFerrari(2023);
	n.speed();
	n.autoSystem();
}
}
