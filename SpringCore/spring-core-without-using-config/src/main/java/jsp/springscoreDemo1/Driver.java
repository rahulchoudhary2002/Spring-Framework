package jsp.springscoreDemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jsp.springscoreDemo1.Employee;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Employee p=context.getBean("employee",Employee.class);
		System.out.println(p);
		
	}
}
