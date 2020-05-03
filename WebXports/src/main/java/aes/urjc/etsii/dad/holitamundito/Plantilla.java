package aes.urjc.etsii.dad.holitamundito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Plantilla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPl;
	
	private String nickname;
	private String nombre;
	private String apellido;
	private String posicion;
	private String nacionalidad;
	private String equip;
	
	@ManyToOne
	//@JoinColumn(name="Nombre")
	private Equipos Equipo;
	
	public Plantilla() {}
	
	

	public Plantilla( String nickname, String nombre, String apellido, String posicion, String nacionalidad,
			Equipos equipo,String equip) {
		
		this.nickname = nickname;
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.equip = equip;
		Equipo = equipo;
	}



	public long getIdPl() {
		return idPl;
	}

	public void setIdPl(long idPl) {
		this.idPl = idPl;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public Equipos getEquipo() {
		return Equipo;
	}

	public void setEquipo(Equipos equipo) {
		Equipo = equipo;
	}
	
	
	
}
