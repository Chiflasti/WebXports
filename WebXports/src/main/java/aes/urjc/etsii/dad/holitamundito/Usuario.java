package aes.urjc.etsii.dad.holitamundito;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUs;
	
	private String nick;
	private String correo;
	private String nombre;
	private String apellidos;
	private String contrasenia;
	
	public Usuario() {
		
	}
	
	public Usuario(String nick, String correo, String nombre, String apellidos,String contrasenia) {
		super();
		nick = this.nick;
		correo = this.correo;
		nombre = this.nombre;
		apellidos = this.apellidos;
		contrasenia = this.contrasenia;
	}
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	@Override
	public String toString() {
		return "Usuario [nick=" + nick + ", correo=" + correo + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", contrasenia=" + contrasenia + "]";
	}
	
	
}