package Repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import Entidades.Equipos;

public interface EquiposRespository extends JpaRepository<Equipos, Long> {
	ArrayList<Equipos> findByNombre (String Nombre);
	ArrayList<Equipos> findByCiudad (String Ciudad);
}
