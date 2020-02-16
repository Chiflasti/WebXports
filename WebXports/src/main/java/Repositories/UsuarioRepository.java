package Repositories;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import Entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	ArrayList<Usuario> findByNombre (String Nombre);
	ArrayList<Usuario> findByNick   (String Nick);
}
