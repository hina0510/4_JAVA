package constructor;

public class TestClass02 {
	private String version;
	public TestClass02(String version) {
		this.version = version;
		System.out.println("설정 완료");
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
