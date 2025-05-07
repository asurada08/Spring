package test10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class AppConfigTest {
	@Bean
	public SerInfo serverInfo() {
		SerInfo info = new SerInfo();
		info.setIpNum("192.168.10.107");
		info.setPortNum("8085");

		return info;
	}
}
