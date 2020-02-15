package Controllers;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entidades.Plantilla;
import Repositories.PlantillaRepository;

@RestController
@RequestMapping("/Plantilla")

public class PlantillaController {
	@Autowired
	private PlantillaRepository repository;
	
	@GetMapping("/")
	public ArrayList<Plantilla> findItems() {
		return (ArrayList<Plantilla>) repository.findAll();
	}
	@PostConstruct
	public void init() {
		repository.save(new Plantilla("The Jungle One","Aitor","Tilla","Jungla","Española","Team Cheese"));
		repository.save(new Plantilla("The Mid One","Francisco","Jones","Mid","Americana","Team Cheese"));
		repository.save(new Plantilla("The Top One","Alberto","Mate","Top","Española","Team Cheese"));
		repository.save(new Plantilla("The ADC One","Elena","Nito","ADC","Española","Team Cheese"));
		repository.save(new Plantilla("The Support One","Lola","Mento","Support","Española","Team Cheese"));
		
		repository.save(new Plantilla("Cacahuate","Jack","Daniels","Jungla","Escocesa","Movistar Titans"));
		repository.save(new Plantilla("Vesper","Grey","Svedka","Mid","Rusa","Movistar Titans"));
		repository.save(new Plantilla("AppleJack","Ricardo","Malibu","Top","Americana","Movistar Titans"));
		repository.save(new Plantilla("Kalimoxo","Roberto","Mondavi","ADC","Española","Movistar Titans"));
		repository.save(new Plantilla("MaiTai","Edmundo","Dantes","Support","Española","Movistar Titans"));
		
		repository.save(new Plantilla("LardLard","Igor","Dito","Jungla","Rusa","eMonos"));
		repository.save(new Plantilla("ElHierbas","Alejandro","Dago","Mid","Española","eMonos"));
		repository.save(new Plantilla("Viper","Ana","Konda","Top","Rumana","eMonos"));
		repository.save(new Plantilla("The Queen","Federico","Mercurio","ADC","Española","eMonos"));
		repository.save(new Plantilla("Bendernator","Adrian","Droide","Support","Español","eMonos"));
		
		repository.save(new Plantilla("Levitica","Elsa","Kapunta","Jungla","Israeli","Comando Sevilla"));
		repository.save(new Plantilla("Trinidad","Jesus","Tituto","Mid","Española","Comando Sevilla"));
		repository.save(new Plantilla("Exodus","Erika","Anzalone","Top","Italiana","Comando Sevilla"));
		repository.save(new Plantilla("Apocalipsis","Francisco","Rupto","ADC","Española","Comando Sevilla"));
		repository.save(new Plantilla("Genesis","Matias","Queroso","Support","Española","Comando Sevilla"));
	}
	@RequestMapping("/")
	public String tablon(Model model) {
		model.addAttribute("Plantilla", repository.findAll());
		return "Plantilla";
	}
}
