package aes.urjc.etsii.dad.holitamundito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;



	@Configuration
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		
		@Autowired
		 public UserRepositoryAuthenticationProvider authenticationProvider;
		
		
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {

	 // Public pages
	 http.authorizeRequests().antMatchers("/").permitAll();
	// http.authorizeRequests().antMatchers("/css/**").permitAll();
	 http.authorizeRequests().antMatchers("/login").permitAll();
	 http.authorizeRequests().antMatchers("/loginerror").permitAll();
	 http.authorizeRequests().antMatchers("/logout").permitAll();
	 http.authorizeRequests().antMatchers("/Noticias").permitAll();
	 http.authorizeRequests().antMatchers("/Equipos").permitAll();
	 http.authorizeRequests().antMatchers("/Plantillas").permitAll();
	 http.authorizeRequests().antMatchers("/Partidos").permitAll();
	 // Private pages (all other pages)
	// http.authorizeRequests().antMatchers("/Usuario").hasAnyRole("USER");
	 //http.authorizeRequests().antMatchers("/index2").hasAnyRole("USER,ADMIN");
	 http.authorizeRequests().antMatchers("/admin").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/home").hasAnyRole("USER","ADMIN");
	 http.authorizeRequests().antMatchers("/PlantillasUser").hasAnyRole("USER","ADMIN");
	 http.authorizeRequests().antMatchers("/PartidosUser").hasAnyRole("USER","ADMIN");
	 http.authorizeRequests().antMatchers("/NoticiasUser").hasAnyRole("USER","ADMIN");
	 http.authorizeRequests().antMatchers("/EquiposUser").hasAnyRole("USER","ADMIN"); 
	 http.authorizeRequests().antMatchers("/CrearNoticia").hasAnyRole("ADMIN");
	 //http.authorizeRequests().antMatchers("/CrearNoticia").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/CrearEquipo").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/CrearPlantilla").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/CrearPartidos").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/CrearUsuario").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EliminarNoticia").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EliminarEquipo").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EliminarPlantilla").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EliminarPartidos").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EliminarUsuario").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/NoticiaEliminada").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EquipoEliminado").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/PlantillaEliminada").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/PartidosEliminada").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/UsuarioEliminado").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/NoticiaNoExiste").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/EquipoNoExiste").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/PlantillaNoExiste").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/PartidosNoExiste").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/UsuarioNoExiste").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/GuardadoNoticia").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/GuardadoEquipo").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/GuardadoPlantilla").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/GuardadoPartidos").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/GuardadoUsuario").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/CascadeNo").hasAnyRole("ADMIN");
	 http.authorizeRequests().antMatchers("/Gestion").hasAnyRole("ADMIN");
	 
	 // Login form
     http.formLogin().loginPage("/login");
     http.formLogin().usernameParameter("username");
     http.formLogin().passwordParameter("password");
     http.formLogin().defaultSuccessUrl("/home");
     http.formLogin().failureUrl("/loginerror");
	 
     // Logout
	 http.logout().logoutUrl("/logout");
	 http.logout().logoutSuccessUrl("/");


	 	}
	 

	@Override
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	 // User
		//auth.authenticationProvider(authenticationProvider);
		auth.inMemoryAuthentication().withUser("user").password(encoder.encode("pass")).roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("adminpass")).roles("USER", "ADMIN");
		}
	}
