package com.npisistemas.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.npisistemas.brewer.service.CadastroCervejaService;
import com.npisistemas.brewer.storage.FotoStorage;
import com.npisistemas.brewer.storage.local.FotoStorageLocal;

@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {
	
	@Bean
	public FotoStorage fotoStorage(){
		return new FotoStorageLocal();
	}
	
}
