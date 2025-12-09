package jsp.springscoreDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	Mobile mobile;
	
	public void use() {
		mobile.ring();
		System.out.println("person is ringing mobile");
	}
}
