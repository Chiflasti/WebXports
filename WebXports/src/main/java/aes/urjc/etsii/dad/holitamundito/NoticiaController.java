package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
/*@RequestMapping("/Noticia")
public String greeting(Model model) {
model.addAttribute("Id","Nombre", "World");
return "greeting_template";
}*/


public class NoticiaController {

	
	@Autowired
	private EquiposRespository repositoryEquipos;
	
	/*@PostConstruct
	public void init() {
		Equipos e1 = new Equipos("Movistar Titans", "Madrid", "Que guay es");
		repositoryEquipos.save(e1);
		Noticia n1 = new Noticia(001,"Jack Daniels: Quiero que se me mire como a un rival al que unca puedes subestimar ","Entrevista","Jugador",14,02,2020,e1);
		repositoryNoticia.save(n1);
	}*/
	
	@GetMapping("/noticia")
	public String Noticia(Model model, Pageable page) {

		model.addAttribute("noticia", repositoryEquipos.findAll(page));

		return "noticia";
	}
}

