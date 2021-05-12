package com.npisistemas.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npisistemas.brewer.model.Grupo;

@Repository
public interface Grupos extends JpaRepository<Grupo, Long>{

}
