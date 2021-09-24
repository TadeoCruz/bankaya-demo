package mx.bankaya.demos.pokeapi.config;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import lombok.extern.log4j.Log4j2;
import mx.bankaya.demos.pokeapi.data.LogPokemonEntity;
import mx.bankaya.demos.pokeapi.data.LogService;

/**
 * Interceptor que recupera la peticion y guarda el log en base de datos
 * @author tcruz
 *
 */
@Log4j2
@Component
public class LogRequestInterceptor implements HandlerInterceptor {
	
	/**
	 * Repositorio
	 */
	@Autowired
	private LogService logService;

	/**
	 * Captura la peticion antes de que sea procesada
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		log.info("Interceptando la petición");

		logService.save( this.logBD(request) );
		
		return true;
	}

	/**
	 * Crea la entidad de log que se va a guardar en base de datos
	 * @param servletRequest {@link HttpServletRequest}
	 * @return {@link LogPokemonEntity} valores a salvar
	 */
	private LogPokemonEntity logBD( HttpServletRequest servletRequest ) {
		
		LogPokemonEntity entity = new LogPokemonEntity();
		entity.setFecha( new Date() );
		entity.setIp( servletRequest.getRemoteHost() );
		entity.setMetodo( servletRequest.getMethod() );
		
		log.info("Creando entidad para persistir en BD {}", entity.toString() );
		
		return entity;
		
	}
}
