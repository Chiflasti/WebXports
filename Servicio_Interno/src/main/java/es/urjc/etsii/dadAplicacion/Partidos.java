package es.urjc.etsii.dadAplicacion;

import java.util.ArrayList;
import java.util.List;


public class Partidos {
	
	private long idPartido;
	

	private String fecha;
	private String equip1;
	private String equip2;
	

	private Jornada jornada;
	
	
	private String hora;
	private String result;
	

	

	public Partidos() {}

	public Partidos(int idPartido, Jornada jornada, String fecha, String hora, String equip1, String equip2, String result) {//Equipos equip2, String result) {
		this.idPartido = idPartido;
		this.fecha = fecha;
		this.jornada = jornada;
		this.hora = hora;
		this.equip1 = equip1;
		this.equip2 = equip2;
		this.result = result;
	}
	
	public String getEquip1() {
		return equip1;
	}

	public void setEquip1(String equip1) {
		this.equip1 = equip1;
	}

	public String getEquip2() {
		return equip2;
	}

	public void setEquip2(String equip2) {
		this.equip2 = equip2;
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

