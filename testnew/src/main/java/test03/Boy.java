package test03;

public class Boy {
	String naem="hgk";
	//main에서 Boy boy = new Boy(); boy.setName("홍길동");
	//값 주입 = 값 저장 = 값 설정 = 값 초기화, boy.setName("홍길동");
	//xml 환경설정에서 주입을 시켜 주어야 함.
	public void setName(String name) {
		this.naem = name;
	}
}
