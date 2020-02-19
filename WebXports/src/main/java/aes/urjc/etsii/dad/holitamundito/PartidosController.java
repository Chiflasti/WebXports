package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@RestController
//@RequestMapping("/partidos")

@Controller
public class PartidosController {
	
	@Autowired
	private PartidosRepository repositorypar;
	@Autowired
	private JornadaRepository repositoryjor;
	
	
		
	
	
}

