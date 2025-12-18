package jsp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

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
	public String getEmployee(ModelMap map) {
		map.put("ename", "riya");
		map.put("salary", "42000");

		return "employee.jsp";

	}

	@GetMapping("/appliction")
	public ModelAndView getApp(ModelAndView view) {

		view.addObject("appName", "whatsapp");
		view.addObject("appVersion", "1.0");
		view.setViewName("app.jsp");
		return view;

	}

	@GetMapping("/form")
	public String triggerForm() {
		return "form.jsp";
	}
//	@PostMapping("/save")
//	public ModelAndView saveStudent(HttpServletRequest req,ModelAndView view) {
//		String sid=req.getParameter("id");
//		String sname=req.getParameter("name");
//		String sage=req.getParameter("age");
//		String sgender=req.getParameter("gender");
//		view.addObject("id",sid);
//		view.addObject("name",sname);
//		view.addObject("age",sage);
//		view.addObject("gender",sgender);
//		
//		view.setViewName("display.jsp");
//		return view;
//		
//	}

	@PostMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student, ModelAndView view) {
		view.addObject("student", student);
		view.setViewName("display.jsp");

		return view;
	}

}
