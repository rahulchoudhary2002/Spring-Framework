package jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String homePage() {
		return ("home.jsp");

	}

	@GetMapping("/student")
	public String getStudent(Model model) {
		model.addAttribute("sid", "12");
		model.addAttribute("sname", "smith");
		return "student.jsp";

	}
	@GetMapping("/employee")
	public String getEmployee(ModelMap map){
		map.put("ename","riya");
		map.put("salary","42000");
		
		return "employee.jsp";
		
	}
}
