package aes.urjc.etsii.dad.holitamundito;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;

@SpringBootApplication
public class WebXportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebXportsApplication.class, args);
	}
	
	@Bean
	 public Config config() {
	 Config config = new Config();
	 JoinConfig joinConfig = config.getNetworkConfig().getJoin();
	 //Lo ponemos a true para que funcione con contenedores Docker
	 joinConfig.getMulticastConfig().setEnabled(true);
	 return config;
	 }

}
