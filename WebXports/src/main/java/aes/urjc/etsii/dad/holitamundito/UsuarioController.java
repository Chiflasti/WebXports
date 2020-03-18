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
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
//@RequestMapping("/Usuario")


/*@Controller
public class UsuarioController {

	@Autowired 
	private UsuarioRepository repositoryUs;
	
	
	/*@PostConstruct
	public void init() {
		//Usuario u1 = new Usuario("yoshi","yoshi@gmail.com","Alberto","García","123");
		//repositoryUs.save(u1);
		//Usuario u2 = new Usuario("mario","mario@gmail.com","Mario","Piloto","123");
		//repositoryUs.save(u2);
	}
	*/
/*
	@GetMapping("/Usuario")
	public String Noticia(Model model) {
		model.addAttribute("usuario", repositoryUs.findAll());
		return "Usuario";
	}
	
	@PostMapping("/CrearUsuario")
	public String crearPlantilla(Model model, Usuario u) {
		repositoryUs.save(u);
		return "GuardadoUsuario";
	}
	
	@PostMapping(value = "/EliminarUsuario")
	public String eliminarPlantilla(Model model, @RequestParam long idUs){
		Optional<Usuario> usuario = repositoryUs.findById(idUs);

		if(usuario.isPresent()) {
			repositoryUs.delete(usuario.get());
			return "UsuarioEliminado";
		}else {
			return "UsuarioNoExiste";
		}

	}
	
	@GetMapping("/CrearUsuario")
	public String crearUsuarioTem(Model model, Usuario u , HttpServletRequest request) {
		Usuario user = repositoryUs.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "CrearUsuario";
	}
	
	@GetMapping("/EliminarUsuario")
	public String eliminarUsuarioTem(Model model,Usuario u, HttpServletRequest request) {
		Usuario user = repositoryUs.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "EliminarUsuario";
	}
	

}*/
