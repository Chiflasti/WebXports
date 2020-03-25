package es.urjc.etsii.dadAplicacion;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AvisoPartidos {
	 @NotNull
	    private String name;

	    @NotNull
	    @Email
	    private String email;

	    @NotNull
	    @Min(10)
	    private String aviso;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getAviso() {
	        return aviso;
	    }

	    public void setFeedback(String aviso) {
	        this.aviso = aviso;
	    }
	}
