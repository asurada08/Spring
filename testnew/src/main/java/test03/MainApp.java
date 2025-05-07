package test03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

//스프링 환경변수를 이용해 보자
public class MainApp {

	public static void main(String[] args) {
		//파일 형식에 무관하게 읽어와서 객체 만들어 놓는다
		Resource resource = new FileSystemResource("src/main/java/test03/applicationContext.xml");
		//FileSystemResource은 파일 절대 경로 지정(거의 안씀)
		//빈 생성
		BeanFactory factory = new XmlBeanFactory(resource);
		//HelloBean bean = (HelloBean)factory.getBean("helloBean");
		//스프링 컨테이너에서 helloBean 객체를 요청
		HelloBean helloBean = (HelloBean)factory.getBean("helloBean", HelloBean.class);
		HelloBean hello3 = factory.getBean("hello3",HelloBean.class);
		
		System.out.println("helloBean : "+helloBean.hashCode());
		System.out.println("hello3 : "+hello3.hashCode());
		
		helloBean.printHello("Hello ");
		hello3.printHello("good morning ");
				
		System.out.println("");
		HelloBean helloGirl = (HelloBean)factory.getBean("helloGirl", HelloBean.class);
		helloGirl.printHello("소녀?");
	}

}
