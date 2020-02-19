package aes.urjc.etsii.dad.holitamundito;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	
	List<Noticia> findByNombre(String nombre);
}
