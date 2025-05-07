package test14Aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext app=new 
		GenericXmlApplicationContext("test14Aop/application14.xml");
	
		Student stu=app.getBean("student",Student.class);
		stu.getStudentInfo();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Worker worker=app.getBean("worker",Worker.class);
		worker.getWorkerInfo();
		app.close();

	}

}
