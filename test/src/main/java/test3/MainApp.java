package test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		//파일 형식에 무관하게 읽어와서 객체만들어 놓는다.
		Resource resource=new FileSystemResource("src/main/java/test3/applicationContext.xml");
		//빈생성
		BeanFactory factory=new XmlBeanFactory(resource);
		
		//HelloBean helloBean2=(HelloBean)factory.getBean("helloBean");
		HelloBean helloBean=factory.getBean("helloBean",HelloBean.class);
		HelloBean hello3=factory.getBean("hello3",HelloBean.class);
		
		System.out.println("helloBean--->"+helloBean.hashCode());
		System.out.println("hello3------>"+hello3.hashCode());
		
		//사용
		helloBean.printHello("안녕안녕!");
		hello3.printHello("하이루!!!  ㅎ ㅎ ㅎ ㅋ ㅋ");
		
		System.out.println("========girl======");
		HelloBean helloGirl=factory.getBean("helloGirl",HelloBean.class);
		helloGirl.printHello("안녕안녕!");
	}
}
