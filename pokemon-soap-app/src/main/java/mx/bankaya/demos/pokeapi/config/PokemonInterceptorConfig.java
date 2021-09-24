package mx.bankaya.demos.pokeapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class PokemonInterceptorConfig extends WebMvcConfigurationSupport {

	@Autowired
	LogRequestInterceptor logInterceptor;

	@Override
	public void addInterceptors( InterceptorRegistry registry) {
		registry.addInterceptor( logInterceptor ).addPathPatterns("/**");
		super.addInterceptors(registry);
	
	}
}
