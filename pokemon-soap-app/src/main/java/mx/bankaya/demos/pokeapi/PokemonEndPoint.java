package mx.bankaya.demos.pokeapi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import lombok.extern.log4j.Log4j2;
import mx.bankaya.demos.pokeapi.rest.client.PokemonClient;
import mx.bankaya.demos.pokeapi.rest.client.response.PokemonResponse;
import mx.bankaya.demos.web_service.Abilities;
import mx.bankaya.demos.web_service.GetPokemonRequest;
import mx.bankaya.demos.web_service.GetPokemonResponse;
import mx.bankaya.demos.web_service.HeldItem;
import mx.bankaya.demos.web_service.ObjectFactory;
import mx.bankaya.demos.web_service.Pokemon;

/**
 * Clase que publica el servicio SOAP
 * @author tcruz
 *
 */
@Log4j2
@Endpoint
public class PokemonEndPoint {

	private static final String NAMESPACE_URI = "http://bankaya.mx/demos/web-service";

	/**
	 * Instancia del cliente para consumir el apirest pokeapi
	 */
	@Autowired
	private PokemonClient pokemonClient;
	
	ObjectFactory factory = new ObjectFactory();

	/**
	 * Expone el metodo getPokemonRequest para consultar un pokemon
	 * @param request {@link GetPokemonRequest} nombre del pokemon
	 * @return {@link GetPokemonResponse} respuesta del pokemon localizado
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
	@ResponsePayload
	public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
		
		
		log.info("Consultando el pokemon: {} ", request.getName() );
		
		PokemonResponse pokemonResponse = pokemonClient.getPokemon( request.getName() );
		
		return utilsCopyData(pokemonResponse);
	}
	
	
	public GetPokemonResponse utilsCopyData( PokemonResponse pokemonResponse ) {
		
		GetPokemonResponse response = factory.createGetPokemonResponse();
		Pokemon pokemon = new Pokemon();
				
		List<JAXBElement> abilities =  new ArrayList<>();
		pokemonResponse.getAbilities().forEach( a -> {
			Abilities item = factory.createAbilities();
			BeanUtils.copyProperties(a, item);
			
			JAXBElement<Abilities> jaxbAbilities = new JAXBElement<Abilities>(new QName(Abilities.class.getSimpleName()), Abilities.class, null);
			jaxbAbilities.setValue(item);
			abilities.add(jaxbAbilities);
		});
		
		List<JAXBElement> helds =  new ArrayList<>();
		pokemonResponse.getHeld_items().forEach( h -> {
			HeldItem item = factory.createHeldItem();
			BeanUtils.copyProperties(h, item);
			
			JAXBElement<HeldItem> jaxbHeld = new JAXBElement<HeldItem>(new QName(HeldItem.class.getSimpleName()), HeldItem.class, null);
			jaxbHeld.setValue(item);
			helds.add(jaxbHeld);
		});
		
		
		JAXBElement<Integer> jaxbId = new JAXBElement<Integer>(new QName(Integer.class.getSimpleName()), Integer.class, null);
		jaxbId.setValue( pokemonResponse.getId() );
		
		JAXBElement<Integer> jaxbExperience = new JAXBElement<Integer>(new QName(Integer.class.getSimpleName()), Integer.class, null);
		jaxbId.setValue( pokemonResponse.getBase_experience() );
		
		JAXBElement<String> jaxbName = new JAXBElement<String>(new QName(String.class.getSimpleName()), String.class, null);
		jaxbName.setValue( pokemonResponse.getName() );
		
		JAXBElement<String> jaxbLocation = new JAXBElement<String>(new QName(String.class.getSimpleName()), String.class, null);
		jaxbName.setValue( pokemonResponse.getLocation_area_encounters() );
		
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add(jaxbExperience);
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add(jaxbId);
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add(jaxbName);
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add(jaxbLocation);
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add( (JAXBElement<?>) abilities );
		pokemon.getAbilitiesAndBaseExperienceAndHeldItems().add((JAXBElement<?>) helds);
		
		
		response.setPokemon(pokemon);
		
		log.info("Respuesta: {} ", pokemon.toString() );
		return response;
	}
	
}
