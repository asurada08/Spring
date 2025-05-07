package test06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//객체 생성
		AbstractApplicationContext abs = new ClassPathXmlApplicationContext("classpath:test06/applicationContext6.xml");
		//ClassPathXmlApplicationContext은 root부터 경로지정
		
		Student student1 = abs.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		System.out.println("취미 : " + student1.getHobby());
		System.out.println("신장 : " + student1.getHeight());
		System.out.println("체중 : " + student1.getWeight());
		System.out.println("============================");
		
		Student student2 = abs.getBean("student2", Student.class);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("취미 : " + student2.getHobby());
		System.out.println("신장 : " + student2.getHeight());
		System.out.println("체중 : " + student2.getWeight());
		abs.close();
	}

}
