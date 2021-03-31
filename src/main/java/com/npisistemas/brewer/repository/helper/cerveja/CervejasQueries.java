package com.npisistemas.brewer.repository.helper.cerveja;

import java.util.List;

import com.npisistemas.brewer.model.Cerveja;
import com.npisistemas.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {

	public List<Cerveja> filtrar(CervejaFilter filtro);
	
}
