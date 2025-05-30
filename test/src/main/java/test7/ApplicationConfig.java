package test7;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("test7/applicationContext7.xml")// xml파일을 여기에 포함 시킴
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys=new ArrayList<String>();
		hobbys.add("공상하기");
		hobbys.add("잠자기");
		
		Student student= new Student("장길산",20,hobbys);
		student.setHeight(190);
		student.setWeight(90);
		return student;
	}
}
