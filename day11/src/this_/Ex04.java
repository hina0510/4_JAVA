package this_;

public class Ex04 {
	//연산 담당, 이름 끝에 님을 붙여주고, 나이는 만으로 계산
	private DTO04 dto = new DTO04();
	public String nameOp() {
		String name =dto.getName();
		return name+"님";
	}
	public int ageOp() {
		int age = dto.getAge();
		return age - 1;
	}
	public void getNameAge() {
		dto.getName();
		dto.getAge();
	}
	public void saveNameAge(String name, int age) {
		dto.setName(name);
		dto.setAge(age);
	}

}
