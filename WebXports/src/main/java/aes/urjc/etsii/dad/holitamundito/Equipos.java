package aes.urjc.etsii.dad.holitamundito;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEq;
	
	private String Nombre;
	private String Ciudad;
	private String Informacion;
	
	@OneToMany
	//@JoinColumn(name="Nombre")
	private List<Plantilla> Plantilla = new ArrayList<>();
	@OneToMany
	//@JoinColumn(name="equipo")
	private List<Noticia> Noticia= new ArrayList<>();
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="equp1")
	private List<Partidos> Partidos= new ArrayList<>();
	
	public Equipos() {}

	public Equipos(String nombre, String ciudad, String informacion) {
		super();
		Nombre = nombre;
		Ciudad = ciudad;
		Informacion = informacion;
		//Plantilla = new ArrayList<>();
		//Noticia = new ArrayList<>();
		//Partidos = new ArrayList<>();
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getInformacion() {
		return Informacion;
	}

	public void setInformacion(String informacion) {
		Informacion = informacion;
	}
}
