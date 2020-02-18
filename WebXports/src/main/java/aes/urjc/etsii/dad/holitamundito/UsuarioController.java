package aes.urjc.etsii.dad.holitamundito;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/Usuario")
@Controller
public class UsuarioController {
	
	@Autowired 
	private UsuarioRepository repository;
	
	
	@PostConstruct
	public void init() {
		repository.save(new Usuario("yoshi","yoshi@gmail.com","Alberto","García","123"));
		repository.save(new Usuario("mario","mario@gmail.com","Mario","Piloto","123"));
	}
	
	
	
}