package test8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext abs= new
		GenericXmlApplicationContext("test8/applicationContext8.xml");
		
		AdminCnn admin=abs.getBean("adminCnn",AdminCnn.class);
		
		System.out.println("admin.id= "+ admin.getAdminId());
		System.out.println("admin.pw= "+ admin.getAdminId());
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("sub_admin.id= "+ admin.getSub_adminId());
		
		System.out.println("sub_admin.pw= "+ admin.getSub_adminPw());
	}
}
