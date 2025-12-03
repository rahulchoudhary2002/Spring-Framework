package jsp.springore;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
		Restaurant ct=factory.getBean("myRes",Restaurant.class);	
		System.out.println(ct);
	}
	
	
}
