package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;





@Controller
public class PartidosController {

	@Autowired
	private PartidosRepository repositorypar;
	
	@Autowired
	private UsuarioRepository repositoryus;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private final String PARTIDOS_URL = "http://localhost:8082/CrearPartidos";
	
	
	@GetMapping("/Partidos")
	public String Partido(Model model, HttpServletRequest request) {
		model.addAttribute("partidos", repositorypar.findAll());
		//Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		//model.addAttribute("admin", request.isUserInRole("ADMIN"));
		//model.addAttribute("user", request.isUserInRole("USER"));
		
		return "Partidos";
	}
	
	@GetMapping("/PartidosUser")
	public String PartidosUser(Model model, HttpServletRequest request) {
		model.addAttribute("partidos", repositorypar.findAll());
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("admin", request.isUserInRole("ADMIN"));
		
		return "PartidosUser";
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
		Partidos p2 = new Partidos();
		p2 = p;
		String url = PARTIDOS_URL;
		HttpEntity<Partidos> partidoBody= new HttpEntity<>(p2);
	    restTemplate.exchange(url, HttpMethod.POST,partidoBody,Void.class);
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

