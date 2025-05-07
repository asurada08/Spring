package test15Aop;

public class HelloBeanBoy implements HelloBean {

	@Override
	public void printHello(String name) {
		System.out.println(name+" Boy");
	}
}
