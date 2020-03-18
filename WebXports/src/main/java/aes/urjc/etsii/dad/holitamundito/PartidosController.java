package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

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
	@Autowired
	private UsuarioRepository repositoryus;
	
	
	@GetMapping("/Partidos")
	public String Partido(Model model) {
		model.addAttribute("partidos", repositorypar.findAll());
		return "Partidos";
	}
	
	@GetMapping("/CrearPartidos")
	public String crearPartidoTem(Model model,Partidos p, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "CrearPartidos";
	}
	
	@PostMapping("/CrearPartidos")
	public String crearPartidos(Model model, Partidos p) {
		repositorypar.save(p);
		return "GuardadoPartidos";
	}
	
	@GetMapping("/EliminarPartidos")
	public String eliminarPartidoTem(Model model,Partidos p, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "EliminarPartidos";
	}
	
	@PostMapping(value = "/EliminarPartidos")
	public String eliminarPartidos(Model model, @RequestParam long idPartido){
		Optional<Partidos> partidos = repositorypar.findById(idPartido);

		if(partidos.isPresent()) {
			repositorypar.delete(partidos.get());
			return "PartidosEliminada";
		}else {
			return "PartidosNoExiste";
		}

	}

}

