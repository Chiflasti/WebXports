package Repositories;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import Entidades.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	ArrayList<Noticia> findByMes (String Mes);
	ArrayList<Noticia> findByEquipo (String Equipo);
	
}
