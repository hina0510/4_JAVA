package quiz_time;

public class TimeService {
	int time, min, sec;
	public void time(int start, int end) {
		time = (end-start)/1000;
		if (time/60>=1) {
			min = time/60;
			sec = time%60;
			System.out.println(min+"분"+sec+"초");
		}else {
			System.out.println(time+"초");
		}
	}
}
