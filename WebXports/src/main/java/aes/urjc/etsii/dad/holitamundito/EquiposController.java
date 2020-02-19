package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
/*@RequestMapping("/Equipos")*/

@Controller
public class EquiposController {
	
	/*@Autowired
	private EquiposRespository repositoryeq;
	
	@PostConstruct
	public void init() {
		Equipos Movistar_Titans = new Equipos("Movistar Titans", "Malaga", "Equipo de una universidad de Malaga, acaban de subir de division");
		repositoryeq.save(Movistar_Titans);
		Equipos Comando_Sevilla = new Equipos("Comando Sevilla", "Sevilla", "Equipo de una universidad de Sevilla, son los que mas veces han ganado la liga");
		repositoryeq.save(Comando_Sevilla);
		Equipos eMonos = new Equipos("eMonos", "Valencia", "Equipo de una universidad de Valencia, acaba de bajar de division");
		repositoryeq.save(eMonos);
		Equipos Team_Cheese = new Equipos("Team Chesee", "Madrid", "Equipo de una universidad de Madrid que ha participado en el torneo desde su fundacion");
		repositoryeq.save(Team_Cheese);
	}*/
	
}
