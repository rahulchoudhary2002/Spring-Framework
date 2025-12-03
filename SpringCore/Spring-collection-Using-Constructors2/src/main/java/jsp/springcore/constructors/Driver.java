package jsp.springcore.constructors;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
		Person ct=factory.getBean("myPerson",Person.class);	
		System.out.println(ct);
		ct.use();
	}
	
	
}
