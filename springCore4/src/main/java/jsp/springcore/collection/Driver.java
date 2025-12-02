package jsp.springcore.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
		Course ct=factory.getBean("myCourse",Course.class);	
		System.out.println(ct);
	}
	
	
}
