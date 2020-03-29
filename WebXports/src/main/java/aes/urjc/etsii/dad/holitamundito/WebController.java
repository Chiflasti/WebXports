package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WebController {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}

	
	@GetMapping("/loginerror")
	public String loginerror() {
		return "loginerror";
	}
	
	
    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
    	Usuario user = userRepository.findByName(request.getUserPrincipal().getName());
    	
    	model.addAttribute("user", request.isUserInRole("USER"));
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
    	model.addAttribute("username", user.getName());
    	
    	
    	return "home";
    }
    
    @GetMapping("/Gestion")
    public String Gestion(Model model, HttpServletRequest request) {
    	Usuario user = userRepository.findByName(request.getUserPrincipal().getName());
    	
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
    	 	
    	return "Gestion";
    }
	
	/*@PostMapping("/CrearUsuario")
	public String crearUsuario(Model model, Usuario u) {
		userRepository.save(u);
		return "GuardadoUsuario";
	}
	
	
	
	@PostMapping(value = "/EliminarUsuario")
	public String eliminarPlantilla(Model model, @RequestParam long idUs){
		Optional<Usuario> usuario = userRepository.findById(idUs);

		if(usuario.isPresent()) {
			userRepository.delete(usuario.get());
			return "UsuarioEliminado";
		}else {
			return "UsuarioNoExiste";
		}

	}*/
    
    @GetMapping("/admin")
    public String admin() {
    	return "admin";
    }

}