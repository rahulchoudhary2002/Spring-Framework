package jsp.springscoreDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShapeApp {
	
	@Qualifier(value="square")
	@Autowired
	Shape shape;
	void display() {
		shape.sides();
		System.out.println("running display");
	}
	
	
}


