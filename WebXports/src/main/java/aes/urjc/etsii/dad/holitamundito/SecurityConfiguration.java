package aes.urjc.etsii.dad.holitamundito;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

	@Configuration
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {

	 // Public pages
	 http.authorizeRequests().antMatchers("/").permitAll();
	 http.authorizeRequests().antMatchers("/login").permitAll();
	 http.authorizeRequests().antMatchers("/loginerror").permitAll();
	 http.authorizeRequests().antMatchers("/logout").permitAll();
	 http.authorizeRequests().antMatchers("/Noticias").permitAll();
	 http.authorizeRequests().antMatchers("/Equipos").permitAll();
	 http.authorizeRequests().antMatchers("/Plantillas").permitAll();
	 http.authorizeRequests().antMatchers("/Partidos").permitAll();
	 // Private pages (all other pages)
	 http.authorizeRequests().anyRequest().authenticated();
	 // Login form
	 http.formLogin().loginPage("/login");
	 http.formLogin().usernameParameter("usuario");
	 http.formLogin().passwordParameter("contrsenia");
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
	 auth.inMemoryAuthentication().withUser("user").password(encoder.encode("pass")).roles("USER");
	 auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("pass")).roles("ADMIN");
		}
	}
