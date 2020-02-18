package Controllers;
import java.awt.print.Pageable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Equipos;
import Entidades.Plantilla;
import Repositories.EquiposRespository;
import Repositories.PlantillaRepository;

@RestController
//@RequestMapping("/Plantilla")

public class PlantillaController {
	@Autowired
	private PlantillaRepository repository;
	private EquiposRespository repositoryeq;
	
	@GetMapping("/")
	public ArrayList<Plantilla> findItems() {
		return (ArrayList<Plantilla>) repository.findAll();
	}
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
		
		Plantilla The_Jungle_One = new Plantilla("The Jungle One","Aitor","Tilla","Jungla","Espanola",Team_Cheese);
		Plantilla The_Mid_One = new Plantilla("The Mid One","Francisco","Jones","Mid","Americana",Team_Cheese);
		Plantilla The_Top_One = new Plantilla("The Top One","Alberto","Mate","Top","Espanola",Team_Cheese);
		Plantilla The_ADC_One = new Plantilla("The ADC One","Elena","Nito","ADC","Espanola",Team_Cheese);
		Plantilla The_Support_One = new Plantilla("The Support One","Lola","Mento","Support","Espanola",Team_Cheese);
		repository.save(The_Jungle_One);//team cheese
		repository.save(The_Mid_One);
		repository.save(The_Top_One);
		repository.save(The_ADC_One);
		repository.save(The_Support_One);
		
		Plantilla Cacahuate = new Plantilla("Cacahuate","Jack","Daniels","Jungla","Escocesa",Movistar_Titans);
		Plantilla Vesper = new Plantilla("Vesper","Grey","Svedka","Mid","Rusa",Movistar_Titans);
		Plantilla AppleJack = new Plantilla("AppleJack","Ricardo","Malibu","Top","Americana",Movistar_Titans);
		Plantilla Kalimoxo = new Plantilla("Kalimoxo","Roberto","Mondavi","ADC","Espanola",Movistar_Titans);
		Plantilla MaiTai = new Plantilla("MaiTai","Edmundo","Dantes","Support","Espanola",Movistar_Titans);
		repository.save(Cacahuate);//Movistar titans
		repository.save(Vesper);
		repository.save(AppleJack);
		repository.save(Kalimoxo);
		repository.save(MaiTai);
		
		Plantilla LardLard = new Plantilla("LardLard","Igor","Dito","Jungla","Rusa",eMonos);
		Plantilla ElHierbas = new Plantilla("ElHierbas","Alejandro","Dago","Mid","Espanola",eMonos);
		Plantilla Viper = new Plantilla("Viper","Ana","Konda","Top","Rumana",eMonos);
		Plantilla The_Queen = new Plantilla("The Queen","Federico","Mercurio","ADC","Espanola",eMonos);
		Plantilla Bendernator = new Plantilla("Bendernator","Adrian","Droide","Support","Espanol",eMonos);
	
		
		repository.save(LardLard);//eMonos
		repository.save(ElHierbas);
		repository.save(Viper);
		repository.save(The_Queen);
		repository.save(Bendernator);
		
		Plantilla Levitica = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla);
		Plantilla Trinidad = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla);
		Plantilla Exodus = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla);
		Plantilla Apocalipsis = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla);
		Plantilla Genesis = new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli",Comando_Sevilla);
		
		repository.save(Levitica);///Comando Sevilla
		repository.save(Trinidad);
		repository.save(Exodus);
		repository.save(Apocalipsis);
		repository.save(Genesis);
		
	}
	@RequestMapping("/Equipos")
	public String tablon(Model model) {
		
		model.addAttribute("equipos", repositoryeq.findAll());
		return "04_FAQs.html";
	}
}
