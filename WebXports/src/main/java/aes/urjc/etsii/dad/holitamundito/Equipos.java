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
	
	private String nombre;
	private String ciudad;
	private String informacion;
	
	@OneToMany
	//@JoinColumn(name="Nombre")
	private List<Plantilla> Plantilla;
	@OneToMany
	//@JoinColumn(name="equipo")
	private List<Noticia> Noticia;
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="equp1")
	private List<Partidos> Partidos;
	
	public Equipos() {}

	public Equipos(String nombre, String ciudad, String informacion) {
		
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.informacion = informacion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		ciudad = ciudad;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		informacion = informacion;
	}
}
