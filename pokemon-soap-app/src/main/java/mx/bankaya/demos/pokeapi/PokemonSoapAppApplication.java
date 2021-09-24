package mx.bankaya.demos.pokeapi;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Clase inicializadora de la aplicacion
 * @author tcruz
 *
 */
@SpringBootApplication
public class PokemonSoapAppApplication {

	/**
	 * Meotodo que incia la aplicacion java
	 * @param args argumentos de la jvm
	 */
	public static void main(String[] args) {
		SpringApplication.run(PokemonSoapAppApplication.class, args);
	}

	/**
	 * Inicializa un {@link RestTemplate} para consumir servicios Rest
	 * @return {@link RestTemplate}
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier( new NoopHostnameVerifier() ).build();
		
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		
		RestTemplate restTemplate = new RestTemplate( requestFactory );
				
		return restTemplate;
	}

}
