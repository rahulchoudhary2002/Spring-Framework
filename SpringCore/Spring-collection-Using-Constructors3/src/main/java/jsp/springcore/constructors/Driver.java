package jsp.springcore.constructors;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
		Product ct=factory.getBean("myProduct",Product.class);	
		System.out.println(ct);
	}
	
	
}
