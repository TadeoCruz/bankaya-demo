package mx.bankaya.demos.pokeapi.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

/**
 * Servicio para realizar operaciones con el repositorio de log
 * @author tcruz
 *
 */
@Service
@Log4j2
public class LogService {

	/**
	 * Repositorio de LOG
	 */
	@Autowired
	LogRepository repository;
	
	/**
	 * Guarda en base de datos informacion de LOG
	 * @param entity {@link LogPokemonEntity}
	 */
	public void save( LogPokemonEntity entity ) {

		log.info("Salvando el log: {}", entity.toString() );
		repository.save(entity);
	}
	
}
