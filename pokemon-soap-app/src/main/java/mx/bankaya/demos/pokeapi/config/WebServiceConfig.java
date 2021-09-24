package mx.bankaya.demos.pokeapi.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Configuracion para inicializar el servicio SOAP
 * @author tcruz
 *
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	/**
	 * Crea el despacuador para publicar el servicio web
	 * @param applicationContext
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	/**
	 * Define el puerto y esquema del wsdl
	 * @param countriesSchema
	 * @return {@link DefaultWsdl11Definition
	 */
	@Bean(name = "pokemon")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("PokemonPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://bankaya.mx/demos/web-service");
		wsdl11Definition.setSchema( pokemonSchema() );
		return wsdl11Definition;
	}

	/**
	 * recupera el archivo xsd para publicar el WSDL
	 * @return {@link XsdSchema}
	 */
	@Bean
	public XsdSchema pokemonSchema() {
		return new SimpleXsdSchema(new ClassPathResource("pokemons.xsd"));
	}

}
