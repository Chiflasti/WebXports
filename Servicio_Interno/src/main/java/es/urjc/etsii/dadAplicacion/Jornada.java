package es.urjc.etsii.dadAplicacion;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;


public class Jornada {
	
		private int idJor;
		
		private int numJor;
		private String fecha;
		private int temporada;
		

	public Jornada() {}

	public Jornada(int numJor, String fecha, int temporada) {
		
		this.numJor = numJor;
		this.fecha = fecha;
		this.temporada = temporada;
	}
	

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	public int getNumJ() {
		return numJor;
	}

	public void setNumJ(int numJ) {
		this.numJor = numJ;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Jornada [numJor=" + numJor + ", fecha=" + fecha + ", temporada=" + temporada + "]";
	}
	
}
