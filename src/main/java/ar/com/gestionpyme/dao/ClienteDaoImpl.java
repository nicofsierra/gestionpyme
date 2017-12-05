package ar.com.gestionpyme.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.com.gestionpyme.modelo.Cliente;

@Service("clienteDao")
public class ClienteDaoImpl {
	
	@Inject
	private SessionFactory sessionFactory;
	
	//@Override
	public Boolean guardarCliente(Cliente cliente){
		final Session session = sessionFactory.getCurrentSession();
		//session.save(cliente);
		System.out.println(session.save(cliente).getClass().getName());
		return true;
	}

}
