package aes.urjc.etsii.dad.holitamundito;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebController {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	
	
	@RequestMapping("/login")
	public String Login() {
		return "Login";
	}

	
	@RequestMapping("/loginerror")
	public String loginerror() {
		return "loginerror";
	}
	
	
	@RequestMapping("/home")
    public String home(Model model, HttpServletRequest request) {
    	Usuario user = userRepository.findByName(request.getUserPrincipal().getName());
    	
    	model.addAttribute("user", request.isUserInRole("USER"));
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
    	model.addAttribute("username", user.getName());
    	
    	
    	return "home";
    }
    
	@RequestMapping("/Gestion")
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
    
	/*@RequestMapping("/admin")
    public String admin() {
    	return "admin";
    }*/

}