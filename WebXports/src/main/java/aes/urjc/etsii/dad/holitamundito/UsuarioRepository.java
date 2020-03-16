package aes.urjc.etsii.dad.holitamundito;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

  Usuario findByName(String name);

}
