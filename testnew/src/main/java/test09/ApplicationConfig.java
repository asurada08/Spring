package test09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	@Value("${admin.id}") //키 삽입
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;
	@Value("${sub_admin.id}")
	private String sub_adminId;
	@Value("${sub_admin.pw}")
	private String sub_adminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		//외부 파일을 읽어올수 있게 하는 환경 객체 생성
		PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] location = new Resource[2];
		
		location[0] = new ClassPathResource("admin.properties");
		location[1] = new ClassPathResource("sub_admin.properties");
		//ClassPathResource class_path에 저장된 저장된 리소스파일을 가져오는 클래스
		config.setLocations(location);
		
		return config;
	}
	
	@Bean //생략하면 adminconfig()를 뜯함
	public AdminCnn adminconfig() {
		AdminCnn admin = new AdminCnn();
		admin.setAdminId(adminId);
		admin.setAdminPw(adminPw);
		admin.setSub_adminId(sub_adminId);
		admin.setSub_adminPw(sub_adminPw);
		
		return admin;
	}
}
