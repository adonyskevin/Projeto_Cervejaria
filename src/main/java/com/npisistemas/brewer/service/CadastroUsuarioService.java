package com.npisistemas.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.npisistemas.brewer.model.Usuario;
import com.npisistemas.brewer.repository.Usuarios;
import com.npisistemas.brewer.service.exception.EmailJaCadastradoException;

@Service
public class CadastroUsuarioService {
	
	@Autowired
	private Usuarios usuarios;
	
	@Transactional
	public void salvar(Usuario usuario){
		Optional<Usuario> usuarioExistente = usuarios.findByEmailIgnoreCase(usuario.getEmail());
		
		if (usuarioExistente.isPresent()){
			throw new EmailJaCadastradoException("Email já cadastrado");
		}
		
		usuarios.save(usuario);
	}
}
