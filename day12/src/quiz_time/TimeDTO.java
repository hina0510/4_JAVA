package quiz_time;

public class TimeDTO {
	private int start;
	private int end;
	public int startTime() {
		start = (int)System.currentTimeMillis();
		return start;
	}
	public int endTime() {
		end = (int)System.currentTimeMillis();
		return end;
	}
}
