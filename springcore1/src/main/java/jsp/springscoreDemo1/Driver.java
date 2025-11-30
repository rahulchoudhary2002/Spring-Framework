package jsp.springscoreDemo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jsp.springscoreDemo1.Employee;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("myConfig.xml");
		Employee p=factory.getBean("myEmployee",Employee.class);
		System.out.println(p);
		
	}
}
