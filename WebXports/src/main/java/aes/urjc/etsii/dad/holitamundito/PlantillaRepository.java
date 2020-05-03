package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaRepository extends JpaRepository<Plantilla, Long> {
	
	Optional<Plantilla> findByNickname(String nickname);
}
