package com.npisistemas.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npisistemas.brewer.model.Cidade;
import com.npisistemas.brewer.repository.Cidades;
import com.npisistemas.brewer.service.exception.CidadeJaCadastradaException;

@Service
public class CadastroCidadeService {
	
	@Autowired
	private Cidades cidades;
	
	@Transactional
	public void salvar(Cidade cidade){
		Optional<Cidade> cidadeOptional = cidades.findByNomeAndEstado(cidade.getNome(), cidade.getEstado());
		if (cidadeOptional.isPresent()){
			throw new CidadeJaCadastradaException("Cidade já cadastrada!");
		}
		cidades.save(cidade);
	}
}
