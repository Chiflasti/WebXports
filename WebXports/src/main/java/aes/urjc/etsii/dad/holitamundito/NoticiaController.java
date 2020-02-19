package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/Noticia")

public class NoticiaController {

	
	@Autowired
	private EquiposRespository repositoryEquipos;
	@Autowired
	private NoticiaRepository repositorynot;
	
	
	
	
	
}
