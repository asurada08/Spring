package test08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext abs = new GenericXmlApplicationContext("test08/applicationContext8.xml");
		//GenericXmlApplicationContext는 파일 시스템이나 클래스 경로에 있는 XML 설정 파일을 로딩
		
		AdminCnn admin = abs.getBean("adminCnn", AdminCnn.class);
		
		System.out.println("admin.id : " + admin.getAdminId());
		System.out.println("admin.pw : " + admin.getAdminPw());
		System.out.println("======================");
		System.out.println("sub_admin.id : " + admin.getSub_adminId());
		System.out.println("sub_admin.pw : " + admin.getSub_adminPw());
		abs.close();
	}

}