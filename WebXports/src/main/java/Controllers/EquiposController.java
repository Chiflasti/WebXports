package Controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Equipos;
import Repositories.EquiposRespository;

@RestController
/*@RequestMapping("/Equipos")*/
public class EquiposController {
	@Autowired
	private EquiposRespository repository;
	
	@GetMapping("/")
	public ArrayList<Equipos> findItems() {
		return (ArrayList<Equipos>) repository.findAll();
	}
	@PostConstruct
	public void init() {
		repository.save(new Equipos("Team Cheese", "Madrid","Equipo de una universidad de Madrid que ha participado en el torneo desde su fundacion"));
		repository.save(new Equipos("Movistar Titans","Malaga","Equipo de una universidad de Malaga, acaban de subir de division"));
		repository.save(new Equipos("eMonos","Valencia", "Equipo de una universidad de Valencia, acaba de bajar de division"));
		repository.save(new Equipos("Comando Sevilla","Sevilla","Equipo de una universidad de Sevilla, son los que mas veces han ganado la liga"));
	}
	
	@RequestMapping("/")
	public String tablon(Model model) {
		model.addAttribute("Equipos", repository.findAll());
		return "Equipos";
	}
}
