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
	
	private String NickName;
	private String Nombre;
	private String Apellido;
	private String Posicion;
	private String Nacionalidad;
	private String Equip;
	
	@ManyToOne
	//@JoinColumn(name="Nombre")
	private Equipos Equipo;
	
	public Plantilla() {}

	public Plantilla(String nickName, String nombre, String apellido, String posicion, String nacionalidad,
			Equipos equipo, String equip) {
		super();
		NickName = nickName;
		Nombre = nombre;
		Apellido = apellido;
		Posicion = posicion;
		Nacionalidad = nacionalidad;
		Equipo = equipo;
		Equip = equip; 
	}

	
	
	public String getEquip() {
		return Equip;
	}

	public void setEquip(String equip) {
		Equip = equip;
	}

	public long getIdPl() {
		return idPl;
	}

	public void setIdPl(long idPl) {
		this.idPl = idPl;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getPosicion() {
		return Posicion;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public Equipos getEquipo() {
		return Equipo;
	}

	public void setEquipo(Equipos equipo) {
		Equipo = equipo;
	}

}
