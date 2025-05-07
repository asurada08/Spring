package test04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/main/java/test04/applicationContext4.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		HelloBean bean = factory.getBean("helloBean", HelloBean.class);
		bean.printHello("호잇!");
	}
}
