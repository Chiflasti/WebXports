package Controllers;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Usuario;
import Repositories.UsuarioRepository;

@RestController
@RequestMapping("/Usuario")

public class UsuarioController {
	
	@Autowired 
	private UsuarioRepository repository;
	
	@GetMapping("/")
	public ArrayList<Usuario>findItem(){
		return(ArrayList<Usuario>)repository.findAll();
	}
	@PostConstruct
	public void init() {
		repository.save(new Usuario("yoshi","yoshi@gmail.com","Alberto","García","123"));
		repository.save(new Usuario("mario","mario@gmail.com","Mario","Piloto","123"));
	}
	@RequestMapping("/")
	public String usuarios(Model model) {
		model.addAttribute("Usuario", repository.findAll());
		return "Usuario";
	}
	
	
}