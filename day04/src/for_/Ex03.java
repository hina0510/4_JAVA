package for_;

public class Ex03 {
	public static void main(String[] args) {
		/*
		for(int i=1;i<=5;i++) {
			System.out.println(i+".hello");
		}
		 */
		for(int i=1;i<=25;i++) {
			if(i%5==0) {
				System.out.println(i);
			}else{
				System.out.print(i+" ");
			}
		}
	}
}
