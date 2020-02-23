package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@Controller
public class PartidosController {

	@Autowired
	private PartidosRepository repositorypar;
	
	
	@GetMapping("/Partidos")
	public String Noticia(Model model) {
		model.addAttribute("partidos", repositorypar.findAll());
		return "Partidos";
	}
	
	@PostMapping("/CrearPartidos")
	public String crearPlantilla(Model model, Partidos p) {
		repositorypar.save(p);
		return "GuardadoPartidos";
	}
	
	@PostMapping(value = "/EliminarPartidos")
	public String eliminarPlantilla(Model model, @RequestParam long idPartido){
		Optional<Partidos> partidos = repositorypar.findById(idPartido);

		if(partidos.isPresent()) {
			repositorypar.delete(partidos.get());
			return "PartidosEliminada";
		}else {
			return "PartidosNoExiste";
		}

	}

}

