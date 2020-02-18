package Controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Jornada;
import Repositories.JornadaRepository;

@RestController
//@RequestMapping("/jornadas")
public class JornadaController {
	
	@Autowired
	private JornadaRepository repository;
	
	
	@GetMapping("/")
	public ArrayList<Jornada> findItems() {
		return (ArrayList<Jornada>) repository.findAll();
	}
	
	@PostConstruct
	public void init() {
		repository.save(new Jornada(1,"01/01/2020",1));
		repository.save(new Jornada(2,"01/03/2020",4));
	}
	
	@RequestMapping("/")
	public String tablon(Model model) {
		model.addAttribute("jornadas", repository.findAll());
		return "jornada";
	}
}
