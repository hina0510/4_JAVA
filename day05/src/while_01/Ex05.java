package while_01;

public class Ex05 {
	public static void main(String[] args) {
		int i = 10;
		while(i<5) {
			System.out.println("while 종속문장 실행");
		}
		do{
			System.out.println("do while 종속문장");
		}while(i<5);
		
		while(i<5) {
			System.out.println("종속문장 실행");
		}
		for(;i<5;) {
			System.out.println("for 종속문장");
		}

	}
}
