package test10;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		
		//@환경 읽어와 객체 생성하기
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext();
		//환경설정정보를 getEnvironment()가져오는 메소드
		//가져온 정보에 config값을 세팅해줌
		ann.getEnvironment().setActiveProfiles(config);
		//등록해 줌
		ann.register(AppConfigRun.class,AppConfigTest.class);
		ann.refresh();//설정 적용 끝
		
		SerInfo info = ann.getBean("serverInfo", SerInfo.class);
		
		System.out.println("ip 주소 : " + info.getIpNum());
		System.out.println("port 번호 : " + info.getPortNum());
		
		ann.close();
	}
}
