package br.com.totvsplanning.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.totvsplanning.planning.model.Salas;

public interface SalaRepository extends JpaRepository<Salas, Long>{
	
	Salas findByTitulo(String titulo);

}
