package com.easybpms.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.easybpms.db.CRUDException;
import com.easybpms.db.Session;
import com.easybpms.domain.Parameter;

public class CRUDParameter {
	public static void create(Parameter entity, EntityManager session) throws Exception {
		try {			
			session.persist(entity);
		} catch (Exception ex) {			
			throw ex;		
		}
	}
	public static void remove(Parameter entity, EntityManager session) throws Exception {
		try {			
			session.remove(entity);
		} catch (Exception ex) {			
			throw ex;		
		}
	}
	public static Parameter read(Parameter parameter, EntityManager session) throws Exception {
		try {
					
			if(parameter.getId() > 0){
				return session.find(Parameter.class, parameter.getId());
			}
			else if(parameter.getName() != null && parameter.getActivity() != null && parameter.getType() != null){
				return session.createQuery("FROM Parameter WHERE name = '" + parameter.getName() + 
				"' AND activity_id = '" + parameter.getActivity().getId() + 
				"' AND type = '" + parameter.getType() + "'", Parameter.class).getSingleResult();
			}
			else{
				System.err.println("Nao foi possivel carregar a entidade Parameter. Parametros nao fornecidos");
			}
		} catch (NoResultException ex) {		
			throw ex;
		} catch (Exception ex) {		
			throw ex;	
		}
		return parameter;
	}
	
	public static List<Parameter> readAll() throws CRUDException {
		EntityManager session = Session.getSession();
		List<Parameter> list = null;
		try {		
			list = session.createQuery("FROM Parameter", Parameter.class).getResultList();
		} catch (NoResultException ex) {		
			throw ex;
		} catch (Exception ex) {
			throw CRUDException.getException("Inconformidade ao consultar lista de Parametros", ex);
		}
		return list;
	}
}
