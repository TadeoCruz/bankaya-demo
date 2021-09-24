package mx.bankaya.demos.pokeapi.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;
import mx.bankaya.demos.pokeapi.rest.client.response.PokemonResponse;

/**
 * clase que consulta el api https://pokeapi.co/api/v2/pokemon/ para recuperar las propiedades de un pokemon
 * @author tcruz
 *
 */
@Log4j2
@RestController
public class PokemonClient {

	public static final String url = "https://pokeapi.co/api/v2/pokemon/";
	
	@Autowired
	RestTemplate restTemplate;
	
	/**
	 * Recupera informacion de un pokemon a través del api rest de pokeapi
	 * @param pokemon nombre del pokemon a consultar
	 * @return {@link PokemonResponse}
	 */
	public PokemonResponse getPokemon(String pokemon) {
		
		StringBuilder sb = new StringBuilder(url);
		sb.append(pokemon);
		
		log.info("Consulta del servicio: {}", sb.toString() );
		
		return restTemplate.getForObject( sb.toString(), PokemonResponse.class );
	}
}
