package test02;

public class MainApp {

	public static void main(String[] args) {
		//변경하려면 구현하는 클래스만 변경하면 됨
		//결합도를 느슨하게 만들었음
		HelloBean bean = new HelloBeanBoy();
		HelloBean bean2 = new HelloBeanGirl();
		bean.printHello("hello");
		bean2.printHello("안녕");
	}
}
