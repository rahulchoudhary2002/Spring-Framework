package jsp.springscoreDemo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
}

@Configuration
@ComponentScan(basePackages="jsp.springscoreDemo1")
class MyConfig{
	
}