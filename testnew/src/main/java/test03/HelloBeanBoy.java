package test03;

public class HelloBeanBoy implements HelloBean {
	String msg;
	int age;
	Boy helloBoy;
	
	public HelloBeanBoy(String msg, int age, Boy helloBoy) {
		this.msg = msg;
		this.age = age;
		this.helloBoy = helloBoy;
	}

	public void printHello(String name) {
		System.out.println(name + "소년 " + msg + " 몇살 " + age);
		System.out.println("당신의 이름은 "+ name + helloBoy.naem);
	}
}
