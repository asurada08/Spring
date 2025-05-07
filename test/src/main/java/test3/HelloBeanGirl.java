package test3;

public class HelloBeanGirl implements HelloBean {
	String msg;
	int age;
	Boy helloBoy;
	
	public HelloBeanGirl(String msg, int age, Boy helloBoy) {
		this.msg = msg;
		this.age = age;
		this.helloBoy = helloBoy;
	}
	@Override
	public void printHello(String name) {
		System.out.println(name+"소녀..."+msg+"몇살 "+age);
		helloBoy.name="홍길순";
		System.out.println("당신의 이름은 "+helloBoy.name);
	}
}
