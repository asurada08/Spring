package test6;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //환경설정파일로 정의 하겠다는 의미
public class ApplicationConfig {
	
	@Bean //'student1' 객체 생성 
	public Student student1(){
		
		ArrayList<String> hobbys=new ArrayList<String>();
		
		hobbys.add("잠자기");
		hobbys.add("놀기");
		
		
		Student student=new Student("장길산", 20, hobbys);
		student.setHeight(190);
		student.setWeight(90);
		return student;
	}
}
