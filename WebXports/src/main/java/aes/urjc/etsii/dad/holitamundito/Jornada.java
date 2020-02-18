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
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Jornada {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int numJor;
		

		private String fecha;
		private int temporada;
		
		@OneToMany(cascade=CascadeType.ALL)
		//@JoinColumn(name="jornada")
		private List<Partidos> Partidos = new ArrayList<>();

	public Jornada() {}

	public Jornada(int numJ, String fecha, int temporada) {
		super();
		numJ = this.numJor;
		fecha = this.fecha;
		temporada = this.temporada;
		//Partidos = new ArrayList<>();
	}
	
	public void addPartido(Partidos p) {
		this.Partidos.add(p);
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
