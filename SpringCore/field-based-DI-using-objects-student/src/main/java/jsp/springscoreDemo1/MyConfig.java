package jsp.springscoreDemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="package jsp.springscoreDemo1;")
public class MyConfig {

	@Bean(value="object")
	public Object getObject() {
		return new Object();
	}
	
	@Bean(value="student")
	public Student getStudent() {
		return new Student();
		
	}
//	
}
