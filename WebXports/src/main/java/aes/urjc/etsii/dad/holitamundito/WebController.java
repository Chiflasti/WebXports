package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WebController {
	
	
	@GetMapping("/")
	public String Index() {
		return "Index";
	}
	
	@GetMapping("/Login")
	public String Login() {
		return "Login";
	}
	
	@GetMapping("/Loginerror")
	public String loginerror() {
		return "loginerror";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/home")
	public String home(Model model, HttpServletRequest request) {

	 model.addAttribute("admin", request.isUserInRole("ADMIN"));
	 return "home";
	}
	

}