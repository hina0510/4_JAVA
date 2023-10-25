package sleep;

public class Ex01 {
public static void main(String[] args) {
	System.out.println("안녕하세요");
	long start = System.currentTimeMillis();
	try {
		Thread.sleep(1000);//대기시간 걸림(1000=1초)
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	long end = System.currentTimeMillis();
	System.out.println("반갑습니다");
	System.out.println(start);
	System.out.println(end);
	System.out.println("사용시간 : "+(end-start)/1000);
}
}
