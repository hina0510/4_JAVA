package while_01;

public class Ex06 {
	public static void main(String[] args) {
		boolean bool = true;
		while(bool) {
			System.out.println("test");
			bool = false;
		}
		/*
		for(int i=2;i<4;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		*/
		int i=2;
		while(i<4){
			int j=1;
			while(j<=9) {
				System.out.println(i+"X"+j+"="+i*j);
				j++;
			}
			i++;
		}
	}
}
