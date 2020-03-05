package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WebController {
	
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}

	
	@RequestMapping("/login")
	public String login() {
	 return "login";
	}
	
	@GetMapping("/loginerror")
	public String loginerror() {
		return "loginerror";
	}
	
	/*@GetMapping("/home")
	public String home() {
		return "home";
	}
	*/

}