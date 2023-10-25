package temp;

import java.util.Scanner;

public class TempService {
	int num, temp;
	Scanner input = new Scanner(System.in);
	
	public int UpTemp(int temp) {
		System.out.print("올릴 온도 : ");
		num = input.nextInt();
		temp = temp+num;
		return temp;
	}
	public int DownTemp(int temp) {
		System.out.print("내릴 온도 : ");
		num = input.nextInt();
		temp = temp-num;
		return temp;
	}
}
