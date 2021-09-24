package mx.bankaya.demos.pokeapi.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entidad que contiene informacion de LOG
 * @author tcruz
 *
 */
@Entity
@Table(name="LOG_POKEMON")
@Data
public class LogPokemonEntity implements Serializable {

	/**
	 * Id serie de clase
	 */
	private static final long serialVersionUID = 6369233524476927499L;

	/**
	 * Identificador del registro
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * ip de origen
	 */
	private String ip;
	
	/**
	 * Fecha de ejecucion
	 */
	private Date fecha;
	
	/**
	 * Metodo que se ejecuta
	 */
	private String metodo;
	
}
