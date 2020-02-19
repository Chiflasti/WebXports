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
	private int idPartido;
	

	private String fecha;
	
	@ManyToOne
	//@JoinColumn(name="numJor")
	private Jornada jornada;
	
	@ManyToMany
	//@JoinColumn(name="equp1")
	private List<Equipos>equipos;
	
	
	private String hora;
	private String result;
	

	

	public Partidos() {}

	public Partidos(int idPartido, Jornada jornada, String fecha, String hora, String result) {
		super();
		this.idPartido = idPartido;
		this.jornada = jornada;
		this.fecha = fecha;
		this.hora = hora;
		equipos = new ArrayList<>();
		this.result = result;
	}
	
	public void addPartidos(Equipos e1, Equipos e2) {
		equipos.add(e1);
		equipos.add(e2);
	}

	public int getIdPartido() {
		return idPartido;
	}

	

	public void setIdPartido(int idPartido) {
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

	/*public Equipos getEquip1() {
		return equip1;
	}

	public void setEqup1(Equipos equip1) {
		this.equip1 = equip1;
	}

	public Equipos getEquip2() {
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
	return "Partidos [idPartido=" + idPartido + ", fecha=" + fecha + ", jornada=" + jornada + ", hora=" + hora
			+ "]";

}

}

