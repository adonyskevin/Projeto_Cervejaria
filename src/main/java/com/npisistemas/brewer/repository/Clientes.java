package com.npisistemas.brewer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npisistemas.brewer.model.Cliente;
import com.npisistemas.brewer.repository.helper.cliente.ClientesQueries;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries{

	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);
	public List<Cliente> findByNomeStartingWithIgnoreCase(String nome);
}
