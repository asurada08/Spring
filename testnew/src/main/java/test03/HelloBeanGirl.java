package test03;

public class HelloBeanGirl implements HelloBean {
	String msg;
	int age;
	Boy helloBoy;
	
	public HelloBeanGirl(String msg, int age, Boy helloBoy) {
		this.msg = msg;
		this.age = age;
		this.helloBoy = helloBoy;
	}

	public void printHello(String name) {
		System.out.println(name + " 소녀 " + msg + " 몇살 " + age);
		//helloBoy.naem="홍길순";
		System.out.println("당신의 이름은 "+ name + helloBoy.naem);
	}
}
