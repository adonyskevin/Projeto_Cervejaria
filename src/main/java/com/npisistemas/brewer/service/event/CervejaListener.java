package com.npisistemas.brewer.service.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.npisistemas.brewer.storage.FotoStorage;

@Component
public class CervejaListener {
	
	@Autowired
	private FotoStorage fotoStorage;
	
	//Vai ser chamado sempre que uma cerveja for salva
	@EventListener(condition = "#evento.temFoto()")
	public void cervejaSalva(CervejaSalvaEvent evento) {
		fotoStorage.salvar(evento.getCerveja().getFoto());
	}
}
