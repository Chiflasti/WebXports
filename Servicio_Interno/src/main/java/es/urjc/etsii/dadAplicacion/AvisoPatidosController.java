package es.urjc.etsii.dadAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.ValidationException;

@RestController
public class AvisoPatidosController {

	/*@Autowired 
	private UsuarioRepository userRepo;*/
	
	private JavaMailSenderImpl EnvioEmail = new JavaMailSenderImpl();
	
    private Email email;

    public AvisoPatidosController(Email email) {
        this.email = email;
        this.configurarEnvioEmail();
    }
    
        
        
        public void configurarEnvioEmail() {
        
        	EnvioEmail.setHost(email.getHost());
        	EnvioEmail.setPort(2525);
        	EnvioEmail.setUsername(email.getUsername());
        	EnvioEmail.setPassword(email.getPassword());
        }

        
        @PostMapping("/CrearPartidos")
        public void nuevoPartido(@RequestBody Partidos partidos) {
        	
        	SimpleMailMessage correo = new SimpleMailMessage();
        	correo.setFrom("WebXports");
        	correo.setTo("lxinvento@gmail.com");
        	correo.setSubject("Nuevo partido");
        	correo.setText("Te has perdido el resultado del ultimo partido, entra en la app para mirarlo");

        // Send mail
       //System.out.println(message.toString());
        	EnvioEmail.send(correo);
    }	
}