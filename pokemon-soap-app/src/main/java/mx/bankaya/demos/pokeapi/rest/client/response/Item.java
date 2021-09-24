package mx.bankaya.demos.pokeapi.rest.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Parametros generales de nombre del elemento y url de consulta
 * @author tcruz
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Item {

	/**
	 * Nombre del elemento
	 */
	private String name;
	
	
	/**
	 * Url para consultar el elemento
	 */
	private String url;
}
