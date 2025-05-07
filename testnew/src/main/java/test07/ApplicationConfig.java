package test07;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration //환경설정 파일로 정의 하겠다는 의미
@ImportResource("test07/applicationContext7.xml")
public class ApplicationConfig {
	@Bean //'student1' 객체 생성
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		
		hobbys.add("잠자기");
		hobbys.add("놀기");
		
		Student student = new Student("도우너", 24, hobbys);
		student.setHeight(180);
		student.setWeight(70);
		return student;
	}
}
