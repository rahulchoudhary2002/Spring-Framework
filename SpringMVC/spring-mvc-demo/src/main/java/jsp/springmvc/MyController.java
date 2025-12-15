package jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String homePage() {
		return("home.jsp");
		
	}
}
