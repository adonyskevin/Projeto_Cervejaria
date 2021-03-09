package com.npisistemas.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npisistemas.brewer.model.Estilo;
import com.npisistemas.brewer.repository.Estilos;
import com.npisistemas.brewer.service.exception.NomeEstiloJaCadastradoException;

@Service
public class CadastroEstiloService {
	
	@Autowired
	private Estilos estilos;
	
	@Transactional
	public void salvar(Estilo estilo){
		Optional<Estilo> estiloOptional = estilos.findByNomeIgnoreCase(estilo.getNome());
		if (estiloOptional.isPresent()){
			throw new NomeEstiloJaCadastradoException("Nome do estilo já cadastrado!");
		}
		estilos.save(estilo);
	}
}
