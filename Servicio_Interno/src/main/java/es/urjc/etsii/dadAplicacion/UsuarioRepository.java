package es.urjc.etsii.dadAplicacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByName(String name);
	Usuario findByMail(String mail);
}
