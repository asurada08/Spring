package test11;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config = null;
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.equals("run")) {
			config = "run";
		} else if (str.equals("test")) {
			config = "test";
		}
		scan.close();
		
		GenericXmlApplicationContext ann = new GenericXmlApplicationContext();  
		
		ann.getEnvironment().setActiveProfiles(config);
		//메모리에 로딩
		ann.load("test11/application11_run.xml","test11/application11_test.xml");
				
		SerInfo info = ann.getBean("serInfo", SerInfo.class);
		
		System.out.println("ip 주소 : " + info.getIpNum());
		System.out.println("port 번호 : " + info.getPortNum());
		
		ann.close();
	}
}
