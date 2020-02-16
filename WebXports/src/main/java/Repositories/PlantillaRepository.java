package Repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import Entidades.Plantilla;

public interface PlantillaRepository extends JpaRepository<Plantilla, Long> {
	ArrayList<Plantilla> findByNickName (String Nickname);
	ArrayList<Plantilla> findByEquipo (String Equipo);
	ArrayList<Plantilla> findByPosicion (String Posicion);
	ArrayList<Plantilla> findByNombre (String Nombre);
	ArrayList<Plantilla> findByNacionalidad (String Nacionalidad);
}
