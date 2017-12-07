package ar.com.gestionpyme.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.com.gestionpyme.modelo.Calle;

@Service("calleDao")
public class CalleDaoImpl implements CalleDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public List<Calle> obtenerCalle(){
		final Session session = sessionFactory.getCurrentSession(); 
		return session.createCriteria(Calle.class).list();
	}
 

}
