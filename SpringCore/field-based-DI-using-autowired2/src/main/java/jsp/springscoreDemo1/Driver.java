package jsp.springscoreDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Person person=context.getBean("person",Person.class);
		person.use();
	}
}
