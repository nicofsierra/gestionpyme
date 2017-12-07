package ar.com.gestionpyme.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.com.gestionpyme.modelo.SituacionAfip;

@Service("situacionDao")
public class SituacionDaoImpl implements SituacionDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public List<SituacionAfip> obtenerSituacion(){
		final Session session = sessionFactory.getCurrentSession(); 
		return session.createCriteria(SituacionAfip.class).list();
	}

}
