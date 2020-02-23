package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

@Entity
public class Partidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPartido;
	

	private String fecha;
	
	@ManyToOne
	//@JoinColumn(name="numJor")
	private Jornada jornada;
	
	@ManyToMany
	//@JoinColumn(name="equp1")
	private List<Equipos> equipos;
	
	/*@ManyToMany
	//@JoinColumn(name="Nombre")
	private Equipos equip2;*/
	
	private String hora;
	private String result;
	

	

	public Partidos() {}

	public Partidos(int idPartido, Jornada jornada, String fecha, String hora, String result) {//Equipos equip2, String result) {
	//public Partidos(int idPartido, Jornada jornada, String fecha, String hora,String result) {// Equipos equp1, Equipos equip2, String result) {
		super();
		this.idPartido = idPartido;
		this.fecha = fecha;
		this.jornada = jornada;
		this.hora = hora;
		equipos = new ArrayList<>();
		//this.equp1 = equp1;
		//this.equip2 = equip2;
		this.result = result;
	}
	public void addPartidos(Equipos e1, Equipos e2) {
		equipos.add(e1);
		equipos.add(e2);
	}

	
	public List<Equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

	public long getIdPartido() {
		return idPartido;
	}
	

	public void setIdPartido(long idPartido) {
		this.idPartido = idPartido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Jornada getJornada() {
		return jornada;
	}

	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	/*public Equipos getEqup1() {
		return equp1;
	}

	public void setEqup1(Equipos equp1) {
		this.equp1 = equp1;
	}*/

	/*public Equipos getEquip2() {
		return equip2;
	}

	public void setEquip2(Equipos equip2) {
		this.equip2 = equip2;
	}*/
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
	/*return "Partidos [idPartido=" + idPartido + ", fecha=" + fecha + ", jornada=" + jornada + ", hora=" + hora
			+ ", equp1=" + equp1 + ", equip2=" + equip2 + "]";*/
		return "Partidos [idPartido=" + idPartido + ", fecha=" + fecha + ", hora=" + hora+"]";
}

}

