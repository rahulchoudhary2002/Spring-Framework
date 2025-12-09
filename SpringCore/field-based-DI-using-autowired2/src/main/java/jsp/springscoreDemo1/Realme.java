package jsp.springscoreDemo1;

import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile {

	@Override
	public void ring() {
		System.out.println("realme is ringing");
	}
}
