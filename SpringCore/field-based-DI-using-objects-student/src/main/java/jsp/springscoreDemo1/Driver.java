package jsp.springscoreDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Object object=context.getBean("object",Object.class);
		System.out.println(object);
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
	}
}
