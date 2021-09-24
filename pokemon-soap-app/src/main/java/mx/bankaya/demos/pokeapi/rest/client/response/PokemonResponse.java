package mx.bankaya.demos.pokeapi.rest.client.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Respuesta de la consulta al servicio rest https://pokeapi.co/api/v2/pokemon/
 * @author tcruz
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PokemonResponse {
	
	/**
	 * Habilidades del pokemon
	 */
	private List<AbilitiesRest> abilities;
	
	/**
	 * Experiencia base
	 */
	private int base_experience;
	
	/**
	 * Elementos retenidos del pokemon
	 */
	private List<Item> held_items;

	/**
	 * Identificiador del pokemon en base de datos
	 */
	private int id;
	
	/**
	 * Nombre del pokemon
	 */
	private String name;

	/**
	 * Url de consulta para consultar las areas donde se puede localizar el pokemon
	 */
	private String location_area_encounters;
}
