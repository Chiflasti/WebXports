package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPartido;
	

	private String fecha;
	
	@ManyToOne
	private Jornada jornada;
	
	private String hora;
	private String equp1;
	private String equip2;
	private String result;
	

	

	public Partidos() {}

	public Partidos(int idPartido, Jornada jornada, String fecha, String hora, String equp1, String equip2, String result) {
		this.idPartido = idPartido;
		this.fecha = fecha;
		this.jornada = jornada;
		this.hora = hora;
		this.equp1 = equp1;
		this.equip2 = equip2;
		this.result = result;
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

	public String getEqup1() {
		return equp1;
	}

	public void setEqup1(String equp1) {
		this.equp1 = equp1;
	}

	public String getEquip2() {
		return equip2;
	}

	public void setEquip2(String equip2) {
		this.equip2 = equip2;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
	return "Partidos [idPartido=" + idPartido + ", fecha=" + fecha + ", jornada=" + jornada + ", hora=" + hora
			+ ", equp1=" + equp1 + ", equip2=" + equip2 + "]";
}

}

