package test15Aop;

public class HelloBeanGirl implements HelloBean {

	@Override
	public void printHello(String msg) {
		System.out.println(msg+" Girl");
	}
}
