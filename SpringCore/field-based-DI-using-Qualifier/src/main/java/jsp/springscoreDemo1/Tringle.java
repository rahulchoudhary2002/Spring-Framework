package jsp.springscoreDemo1;

import org.springframework.stereotype.Component;


@Component
public class Tringle implements Shape{

	@Override
	public void sides() {
		System.out.println("3sides");
		
	}

}
