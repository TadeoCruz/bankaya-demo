package mx.bankaya.demos.pokeapi.rest.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Abilidades del pokemon
 * @author tcruz
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AbilitiesRest {

	/**
	 * Habilidad
	 */
    protected Item ability;
    
    /**
     * Indica si la hablididad esta oculta
     */
    protected boolean isHidden;
    
    /**
     * Inidica el numero de habilidad
     */
    protected int slot;

}
