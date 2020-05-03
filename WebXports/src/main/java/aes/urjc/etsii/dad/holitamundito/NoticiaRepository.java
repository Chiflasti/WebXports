package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	
	Optional<Noticia> findByNombre(String nombre);
	Optional<Noticia> findByDia(String dia);
}
