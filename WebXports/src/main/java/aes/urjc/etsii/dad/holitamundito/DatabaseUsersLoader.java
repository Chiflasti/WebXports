package aes.urjc.etsii.dad.holitamundito;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUsersLoader {
	
	
	@Autowired
    private UsuarioRepository userRepository;

 /*  @PostConstruct
    private void initDatabase() {
    	
    	userRepository.save(new Usuario("user", "pass", "USER", "sdas@gmail.com"));
		userRepository.save(new Usuario("admin", "adminpass", "ADMIN", "sasd@gmail.com"));
    }
*/
}
