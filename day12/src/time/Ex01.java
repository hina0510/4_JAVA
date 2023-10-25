package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
public static void main(String[] args) {
	long t = System.currentTimeMillis();//현재시간을 초단위로
	System.out.println(t);
	
	Date date = new Date();
	System.out.println(date);//날짜 시간 정보
	
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");
	
	String s = f.format(date);
	System.out.println("date : "+s);
	
	s = f.format(t);
	System.out.println("current : "+s);
}
}
