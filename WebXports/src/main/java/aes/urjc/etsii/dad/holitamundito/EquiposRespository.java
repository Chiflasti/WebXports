package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquiposRespository extends JpaRepository<Equipos, Long> {
	Optional<Equipos> findByNombre(String nombre);
}
