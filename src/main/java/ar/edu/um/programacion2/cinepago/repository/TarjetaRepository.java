package ar.edu.um.programacion2.cinepago.repository;

import ar.edu.um.programacion2.cinepago.domain.Tarjeta;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Tarjeta entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

	Tarjeta findByNumero(String num_tarjeta);
	
}
