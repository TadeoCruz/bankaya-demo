package mx.bankaya.demo.pokemon.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import mx.bankaya.demo.pokemon.client.soap.GetPokemonRequest;
import mx.bankaya.demo.pokemon.client.soap.GetPokemonResponse;
import mx.bankaya.demo.pokemon.client.soap.ObjectFactory;
import mx.bankaya.demo.pokemon.client.soap.PokemonPort;
import mx.bankaya.demo.pokemon.client.soap.PokemonPortService;

class PokemonTest {

	@Test
	void testGetPokemon() {
		
		ObjectFactory factory = new ObjectFactory();

		PokemonPortService pokemonService = new PokemonPortService();
		PokemonPort pokemonPort = pokemonService.getPokemonPortSoap11();
		
		GetPokemonRequest request = factory.createGetPokemonRequest();
		request.setName("charizard");
		
		try {

			GetPokemonResponse response = pokemonPort.getPokemon(null);
			assertNotNull(response);
			
		}catch (Exception e) {
			fail("Error en la peticion del servicio. ", e);
		}
		
		
	}

}
