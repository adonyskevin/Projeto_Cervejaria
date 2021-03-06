package com.npisistemas.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npisistemas.brewer.model.Cerveja;
import com.npisistemas.brewer.repository.helper.cerveja.CervejasQueries;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>, CervejasQueries{
	
}
