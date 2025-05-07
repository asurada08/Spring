package test07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//객체 생성
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//AnnotationConfigApplicationContext은 @Configuration 어노테이션이 붙은 클래스를 이용하여 설정 정보로 로딩
		
		Student student1 = ann.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		System.out.println("취미 : " + student1.getHobby());
		System.out.println("신장 : " + student1.getHeight());
		System.out.println("체중 : " + student1.getWeight());
		System.out.println("============================");
		
		Student student2 = ann.getBean("student2", Student.class);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("취미 : " + student2.getHobby());
		System.out.println("신장 : " + student2.getHeight());
		System.out.println("체중 : " + student2.getWeight());
		ann.close();
	}

}
