package com.npisistemas.brewer.service.event;

import org.thymeleaf.util.StringUtils;

import com.npisistemas.brewer.model.Cerveja;

public class CervejaSalvaEvent {

	private Cerveja cerveja;
	
	public CervejaSalvaEvent(Cerveja cerveja) {
		this.cerveja = cerveja;
	}

	public Cerveja getCerveja() {
		return cerveja;
	}
	
	public boolean temFoto(){
		return !StringUtils.isEmpty(cerveja.getFoto());
	}
}