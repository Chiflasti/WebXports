package Controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Equipos;
import Entidades.Noticia;
import Repositories.EquiposRespository;
import Repositories.NoticiaRepository;

@RestController
//@RequestMapping("/Noticia")

public class NoticiaController {

	@Autowired
	private NoticiaRepository repository;
	private EquiposRespository repositoryEquipos;
	
	@GetMapping("/")
	public ArrayList<Noticia>findItem(){
		return(ArrayList<Noticia>)repository.findAll();
	}
	@PostConstruct
	public void init() {
		Equipos e1 = new Equipos("Movistar Titans", "Madrid", "Que guay es");
		repositoryEquipos.save(e1);
		repository.save(new Noticia("001","Jack Daniels: Quiero que se me mire como a un rival al que unca puedes subestimar ","Entrevista","Jugador",14,02,2020,e1));
	}
	
	@RequestMapping("/")
	public String noticias(Model model) {
		model.addAttribute("Noticia", repository.findAll());
		return "Noticia";
	}
	
}
