package Entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Jornada {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int numJor;
		

		private String fecha;
		private int temporada;
		
		@ManyToOne
		@JoinColumn(name="jornada")
		private ArrayList<Partidos> Partidos;

	public Jornada() {}

	public Jornada(int numJ, String fecha, int temporada) {
		numJ = this.numJor;
		fecha = this.fecha;
		temporada = this.temporada;
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
