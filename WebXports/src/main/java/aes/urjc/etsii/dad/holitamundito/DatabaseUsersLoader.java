package aes.urjc.etsii.dad.holitamundito;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUsersLoader {
	@Autowired
    private UsuarioRepository userRepository;

<<<<<<< HEAD
 /*  @PostConstruct
=======
    /*@PostConstruct
>>>>>>> 63e0fe39f65f4572932987447fd8b977c0883022
    private void initDatabase() {
    	
    	userRepository.save(new Usuario("user", "pass", "USER"));
		userRepository.save(new Usuario("admin", "adminpass", "USER", "ADMIN"));
    }
*/
}
