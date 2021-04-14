package com.npisistemas.brewer.repository.helper.estilo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.npisistemas.brewer.model.Estilo;
import com.npisistemas.brewer.repository.filter.EstiloFilter;

public interface EstilosQueries {
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
}
