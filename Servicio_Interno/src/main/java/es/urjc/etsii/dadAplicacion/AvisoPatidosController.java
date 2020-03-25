package es.urjc.etsii.dadAplicacion;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;

@RestController
@RequestMapping("/avisopartidos")
public class AvisoPatidosController {

    private Email email;

    public AvisoPatidosController(Email email) {
        this.email = email;
    }

    @PostMapping
    public void sendAviso(@RequestBody AvisoPartidos aviso,
                             BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new ValidationException("Aviso is not valid");
        }

        // Create a mail sender
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(this.email.getHost());
        mailSender.setPort(this.email.getPort());
        mailSender.setUsername(this.email.getUsername());
        mailSender.setPassword(this.email.getPassword());

        // Create an email instance
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(aviso.getEmail());
        mailMessage.setTo("josbernikon@gmail.com");
        mailMessage.setSubject("New aviso from " + aviso.getName());
        mailMessage.setText(aviso.getAviso());

        // Send mail
        mailSender.send(mailMessage);
    }
}