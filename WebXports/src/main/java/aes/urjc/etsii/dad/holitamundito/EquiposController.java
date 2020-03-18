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

//@RestController
/*@RequestMapping("/Equipos")*/

@Controller
public class EquiposController {
	
	@Autowired
	private EquiposRespository repositoryeq;
	
	@Autowired
	private UsuarioRepository repositoryus;
	
	@GetMapping("/Equipos")
	public String Equipos(Model model) {
		model.addAttribute("equipos", repositoryeq.findAll());
		return "Equipos";
	}
	
	@PostMapping("/CrearEquipo")
	public String crearEquipo(Model model, Equipos e) {
		repositoryeq.save(e);
		return "GuardadoEquipo";
	}
	
	@GetMapping("/CrearEquipo")
	public String crearEquipoTem(Model model,Equipos e, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "CrearEquipo";
	}
	
	@GetMapping("/EliminarEquipo")
	public String eliminarEquipoTem(Model model,Equipos e, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "EliminarEquipo";
	}
	
	@PostMapping(value = "/EliminarEquipo")
	public String eliminarEquipo(Model model, @RequestParam long idEq){
		Optional<Equipos> equipos = repositoryeq.findById(idEq);

		if(equipos.isPresent()) {
			if(idEq <= 0) {
				return "CascadeNo";
			}else {
			repositoryeq.delete(equipos.get());
			return "EquipoEliminado";
			}
		}else {
			return "EquipoNoExiste";
		}

	}
}
