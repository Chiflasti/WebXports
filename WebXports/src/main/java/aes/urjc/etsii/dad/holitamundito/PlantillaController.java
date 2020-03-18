package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



//@RestController
//@RequestMapping("/Plantilla")

@Controller
public class PlantillaController {
	@Autowired
	private PlantillaRepository repository;
	@Autowired
	private EquiposRespository repositoryeq;
	@Autowired
	private NoticiaRepository repositorynot;
	@Autowired
	private PartidosRepository repositorypar;
	@Autowired
	private JornadaRepository repositoryjor;
	@Autowired
	private UsuarioRepository repositoryuser;
	
	
	
	/*@PostConstruct
	public void init() {
		Equipos Movistar_Titans = new Equipos("Movistar Titans", "Malaga", "Equipo de una universidad de Malaga, acaban de subir de division");
		repositoryeq.save(Movistar_Titans);
		Equipos Comando_Sevilla = new Equipos("Comando Sevilla", "Sevilla", "Equipo de una universidad de Sevilla, son los que mas veces han ganado la liga");
		repositoryeq.save(Comando_Sevilla);
		Equipos eMonos = new Equipos("eMonos", "Valencia", "Equipo de una universidad de Valencia, acaba de bajar de division");
		repositoryeq.save(eMonos);
		Equipos Team_Cheese = new Equipos("Team Chesee", "Madrid", "Equipo de una universidad de Madrid que ha participado en el torneo desde su fundacion");
		repositoryeq.save(Team_Cheese);
		
		Plantilla The_Jungle_One = new Plantilla("The Jungle One","Aitor","Tilla","Jungla","Espanola",Team_Cheese, "Team_Cheese");
		Plantilla The_Mid_One = new Plantilla("The Mid One","Francisco","Jones","Mid","Americana",Team_Cheese, "Team_Cheese");
		Plantilla The_Top_One = new Plantilla("The Top One","Alberto","Mate","Top","Espanola",Team_Cheese, "Team_Cheese");
		Plantilla The_ADC_One = new Plantilla("The ADC One","Elena","Nito","ADC","Espanola",Team_Cheese, "Team_Cheese");
		Plantilla The_Support_One = new Plantilla("The Support One","Lola","Mento","Support","Espanola",Team_Cheese, "Team_Cheese");
		repository.save(The_Jungle_One);//team cheese
		repository.save(The_Mid_One);
		repository.save(The_Top_One);
		repository.save(The_ADC_One);
		repository.save(The_Support_One);
		
		Plantilla Cacahuate = new Plantilla("Cacahuate","Jack","Daniels","Jungla","Escocesa",Movistar_Titans, "Movistar_Titans");
		Plantilla Vesper = new Plantilla("Vesper","Grey","Svedka","Mid","Rusa",Movistar_Titans, "Movistar_Titans");
		Plantilla AppleJack = new Plantilla("AppleJack","Ricardo","Malibu","Top","Americana",Movistar_Titans, "Movistar_Titans");
		Plantilla Kalimoxo = new Plantilla("Kalimoxo","Roberto","Mondavi","ADC","Espanola",Movistar_Titans, "Movistar_Titans");
		Plantilla MaiTai = new Plantilla("MaiTai","Edmundo","Dantes","Support","Espanola",Movistar_Titans, "Movistar_Titans");
		repository.save(Cacahuate);//Movistar titans
		repository.save(Vesper);
		repository.save(AppleJack);
		repository.save(Kalimoxo);
		repository.save(MaiTai);
		
		Plantilla LardLard = new Plantilla("LardLard","Igor","Dito","Jungla","Rusa",eMonos, "eMonos");
		Plantilla ElHierbas = new Plantilla("ElHierbas","Alejandro","Dago","Mid","Espanola",eMonos,"eMonos");
		Plantilla Viper = new Plantilla("Viper","Ana","Konda","Top","Rumana",eMonos,"eMonos");
		Plantilla The_Queen = new Plantilla("The Queen","Federico","Mercurio","ADC","Espanola",eMonos,"eMonos");
		Plantilla Bendernator = new Plantilla("Bendernator","Adrian","Droide","Support","Espanol",eMonos,"eMonos");
	
		
		repository.save(LardLard);//eMonos
		repository.save(ElHierbas);
		repository.save(Viper);
		repository.save(The_Queen);
		repository.save(Bendernator);
		
		Plantilla Levitica = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla, "Comando_Sevilla");
		Plantilla Trinidad = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla, "Comando_Sevilla");
		Plantilla Exodus = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla, "Comando_Sevilla");
		Plantilla Apocalipsis = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla, "Comando_Sevilla");
		Plantilla Genesis = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla, "Comando_Sevilla");
		
		repository.save(Levitica);///Comando Sevilla
		repository.save(Trinidad);
		repository.save(Exodus);
		repository.save(Apocalipsis);
		repository.save(Genesis);
		
		Noticia n1 = new Noticia(001,"Jack Daniels: Quiero que se me mire como a un rival al que unca puedes subestimar ","Entrevista","Jugador","14","02","2020",Comando_Sevilla);
		repositorynot.save(n1);
		Noticia n2 = new Noticia(002,"ElHierbas: Eso de lo que se me acusa no es cierto, no uso chetos","Declaraciones","Jugador","30","02","2020",Movistar_Titans);
		repositorynot.save(n2);
		
		Jornada j1 = new Jornada(1,"01/01/2020",1);
		repositoryjor.save(j1);
		Partidos p1 = new Partidos(1, j1, "01/01/2020", "18:50", "Comando_Sevilla", "eMonos", "0-1");
		p1.addPartidos(Comando_Sevilla, eMonos);
		repositorypar.save(p1);
		
	}*/	
	@GetMapping("/Plantillas")
	public String Plantilla(Model model) {
		model.addAttribute("plantillas", repository.findAll());
		return "Plantillas";
	}
	
	@GetMapping("/PlantillasUser")
	public String PlantillaUser(Model model) {
		model.addAttribute("plantillas", repository.findAll());
		return "PlantillasUser";
	}
	
	@PostMapping("/CrearPlantilla")
	public String crearPlantilla(Model model, Plantilla p) {
		repository.save(p);
		return "GuardadoPlantilla";
	}
	
	@PostMapping(value = "/EliminarPlantilla")
	public String eliminarPlantilla(Model model, @RequestParam long idPl){
		Optional<Plantilla> plantilla = repository.findById(idPl);

		if(plantilla.isPresent()) {
			repository.delete(plantilla.get());
			return "PlantillaEliminada";
		}else {
			return "PlantillaNoExiste";
		}

	}
	
	@GetMapping("/CrearPlantilla")
	public String crearPlantilla(Model model,Plantilla p, HttpServletRequest request) {
		Usuario user = repositoryuser.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "CrearPlantilla";
	}
	
	@GetMapping("/EliminarPlantilla")
	public String eliminarPlantillaTem(Model model,Plantilla p, HttpServletRequest request) {
		Usuario user = repositoryuser.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "EliminarPlantilla";
	}
	
	
	
}