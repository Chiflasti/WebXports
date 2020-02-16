package Entidades;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Equipos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Nombre;
	
	private String Ciudad;
	private String Informacion;
	
	@OneToMany(mappedBy="Equipos")
	@JoinColumn(name="Nombre")
	private ArrayList<Plantilla> Plantilla ;
	
	public Equipos() {}

	public Equipos(String nombre, String ciudad, String informacion) {
		super();
		Nombre = nombre;
		Ciudad = ciudad;
		Informacion = informacion;
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
