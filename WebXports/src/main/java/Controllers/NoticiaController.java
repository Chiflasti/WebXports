package Controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Noticia;
import Repositories.NoticiaRepository;

@RestController
@RequestMapping("/Noticia")

public class NoticiaController {

	@Autowired
	private NoticiaRepository repository;
	
	@GetMapping("/")
	public ArrayList<Noticia>findItem(){
		return(ArrayList<Noticia>)repository.findAll();
	}
	@PostConstruct
	public void init() {
		repository.save(new Noticia("001","Jack Daniels: Quiero que se me mire como a un rival al que unca puedes subestimar ","Entrevista","Jugador",14,02,2020,"Movistar Titans"));
	}
	
	@RequestMapping("/")
	public String noticias(Model model) {
		model.addAttribute("Noticia", repository.findAll());
		return "Noticia";
	}
	
}
