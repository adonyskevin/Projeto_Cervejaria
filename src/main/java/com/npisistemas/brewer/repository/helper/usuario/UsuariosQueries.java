package com.npisistemas.brewer.repository.helper.usuario;

import java.util.Optional;

import com.npisistemas.brewer.model.Usuario;

public interface UsuariosQueries {

	public Optional<Usuario> porEmailEAtivo(String email);
	
}
