package aes.urjc.etsii.dad.holitamundito;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidosRepository extends JpaRepository<Partidos, Long> {
	
	Optional<Partidos> findByFecha(String fecha);
}
