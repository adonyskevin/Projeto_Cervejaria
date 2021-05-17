package com.npisistemas.brewer.repository.helper.cidade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.npisistemas.brewer.model.Cidade;
import com.npisistemas.brewer.repository.filter.CidadeFilter;
import com.npisistemas.brewer.repository.paginacao.PaginacaoUtil;

public class CidadesImpl implements CidadesQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@Autowired
	private PaginacaoUtil paginacaoUtil;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(Cidade.class);
		
		paginacaoUtil.preparar(criteria, pageable);
		adicionarFiltro(filtro, criteria);
		criteria.createAlias("estado", "e");
		
		return new PageImpl<>(criteria.list(), pageable, total(filtro));
	}

	private Long total(CidadeFilter filtro) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(Cidade.class);
		adicionarFiltro(filtro, criteria);
		criteria.setProjection(Projections.rowCount());
		return (Long) criteria.uniqueResult();
	}
	
	private void adicionarFiltro(CidadeFilter filtro, Criteria criteria) {
		Boolean temFiltro = false;
		if (filtro != null) {
			if (!StringUtils.isEmpty(filtro.getCodigo())) {
				temFiltro = true;
				criteria.add(Restrictions.eq("codigo", filtro.getCodigo()));
			}
			
			if (!StringUtils.isEmpty(filtro.getNome())) {
				temFiltro = true;
				criteria.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
			}
			
			if (filtro.getEstado() != null) {
				temFiltro = true;
				criteria.add(Restrictions.eq("estado", filtro.getEstado()));
			}
			
		}
		if (!temFiltro){
			criteria.addOrder(Order.asc("codigo"));
		}
	}
}
