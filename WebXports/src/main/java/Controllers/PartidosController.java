package Controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Jornada;
import Entidades.Partidos;
import Repositories.JornadaRepository;
import Repositories.PartidosRepository;



@RestController
@RequestMapping("/partidos")
public class PartidosController {
	
	@Autowired
	private PartidosRepository repositoryPar;
	private JornadaRepository repositoryJor;
	
	private Jornada jor = new Jornada(1,"01/01/2020",1);
	
	@GetMapping("/")
	public ArrayList<Partidos> findItems() {
		return (ArrayList<Partidos>) repositoryPar.findAll();
	}
	
	@PostConstruct
	public void init() {
		repositoryJor.save(jor);
		repositoryPar.save(new Partidos(1,jor,"01/01/2020","16:00","Equipo1","Equipo2","Equipo1"));
	}
	
	@RequestMapping("/")
	public String tablon(Model model) {
		model.addAttribute("partidos", repositoryPar.findAll());
		return "partido";
	}

}

