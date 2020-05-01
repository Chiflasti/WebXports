package aes.urjc.etsii.dad.holitamundito;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUsersLoader {
	
	
	@Autowired
    private UsuarioRepository userRepository;

   /*@PostConstruct
    private void initDatabase() {
    	
	   	userRepository.save(new Usuario("admin", "adminpass", "ADMIN", "admin@gmail.com"));
	   	userRepository.save(new Usuario("user", "pass", "USER", "user@gmail.com"));
    	userRepository.save(new Usuario("Starky", "pass", "USER", "WebXportsDAD@gmail.com"));
    	//userRepository.save(new Usuario("Hutch", "pass", "USER", "dadwebxports@gmail.com"));
		//userRepository.save(new Usuario("KamiSama", "adminpass", "ADMIN", "kalilinux6669@gmail.com"));
    	userRepository.save(new Usuario("user", "pass", "USER", "razer@gmail.com"));
		userRepository.save(new Usuario("admin", "adminpass", "ADMIN", "kali@gmail.com"));
    }
    */
}
