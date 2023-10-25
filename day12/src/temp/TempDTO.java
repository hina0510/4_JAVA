package temp;

public class TempDTO {
	private int temp = 10;
	TempService ts = new TempService();
	
	public void getUpTemp() {
		temp = ts.UpTemp(temp);
		this.temp = temp;
		setUpTemp();
	}
	public void setUpTemp() {
		System.out.println("올린 온도 : "+temp);
	}
	public void getDownTemp() {
		temp = ts.DownTemp(temp);
		this.temp = temp;
		setDownTemp();
	}
	public void setDownTemp() {
		System.out.println("내린 온도 : "+temp);
	}
}
