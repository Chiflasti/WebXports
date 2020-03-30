package aes.urjc.etsii.dad.holitamundito;

//import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class NoticiaController {

	
	@Autowired
	private NoticiaRepository repositorynot;
	
	@Autowired
	private UsuarioRepository repositoryus;
	

	@GetMapping("/Noticias")
	public String Noticia(Model model) {
		model.addAttribute("noticia", repositorynot.findAll());
		return "Noticias";
	}
	
	@GetMapping("/NoticiasUser")
	public String NoticiaUser(Model model) {
		model.addAttribute("noticia", repositorynot.findAll());
		return "NoticiasUser";
	}
	

	@PostMapping("/CrearNoticia")
	public String crearNoticia(Model model,Noticia n) {
		repositorynot.save(n);
		model.addAttribute("noticia", n);
		return "GuardadoNoticia";
	}
	
	@GetMapping("/CrearNoticia")
	public String crearNoticiaTem(Model model,Noticia n, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "CrearNoticia";
	}
	
	@GetMapping("/EliminarNoticia")
	public String eliminarNoticiaTem(Model model,Noticia n, HttpServletRequest request) {
		Usuario user = repositoryus.findByName(request.getUserPrincipal().getName());
		model.addAttribute("username", user.getName());
    	model.addAttribute("admin", request.isUserInRole("ADMIN"));
		return "EliminarNoticia";
	}
	
	@PostMapping(value = "/EliminarNoticia")
	public String eliminarNoticia(Model model, @RequestParam long id){
		Optional<Noticia> noticia = repositorynot.findById(id);

		if(noticia.isPresent()) {
			repositorynot.delete(noticia.get());
			return "NoticiaEliminada";
		}else {
			return "NoticiaNoExiste";
		}

	}
	
}

