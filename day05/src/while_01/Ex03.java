package while_01;

public class Ex03 {
	public static void main(String[] args) {
		int i = 0;
		while(i<5) {
			i++;
			if (i==3) {
				System.out.println("333333");
				continue;
			}
			System.out.println(i);
		}
		
	}
}
