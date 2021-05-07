package com.npisistemas.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npisistemas.brewer.model.Usuario;
import com.npisistemas.brewer.repository.Usuarios;

@Service
public class CadastroUsuarioService {
	
	@Autowired
	private Usuarios usuarios;
	
	@Transactional
	public void salvar(Usuario usuario){
		
		usuarios.save(usuario);
	}
}
