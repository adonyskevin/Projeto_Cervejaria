package com.npisistemas.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npisistemas.brewer.model.Usuario;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);

}
