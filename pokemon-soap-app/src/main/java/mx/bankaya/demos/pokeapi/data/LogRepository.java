package mx.bankaya.demos.pokeapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Metodos para salvar el log en Base de datos
 * @author tcruz
 *
 */
@Repository
public interface LogRepository extends JpaRepository<LogPokemonEntity, Long>{

}
