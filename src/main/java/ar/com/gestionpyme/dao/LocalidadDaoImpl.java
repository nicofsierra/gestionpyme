package ar.com.gestionpyme.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.com.gestionpyme.modelo.Localidad;

@Service("localidadDao")
public class LocalidadDaoImpl implements LocalidadDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public List<Localidad> obtenerLocalidad(){
		final Session session = sessionFactory.getCurrentSession(); 
		return session.createCriteria(Localidad.class).list();
	}
}
