package ar.com.gestionpyme.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.com.gestionpyme.modelo.Administrador;
import ar.com.gestionpyme.modelo.Usuario;

@Service("loginDao")
public class LoginDaoImpl implements LoginDao{
	
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public Usuario buscarUsuario(String email , String password){
		final Session session = sessionFactory.getCurrentSession();
		return  (Usuario) session.createCriteria(Usuario.class)
			   .add(Restrictions.and(Restrictions.eq("email",email),Restrictions.eq("password",password)))
			    .uniqueResult();
	}
	
	@Override
	public Boolean validarAdministrador(Long idUsuario){
		final Session session = sessionFactory.getCurrentSession();
		Administrador administrador = (Administrador) session.createCriteria(Administrador.class)
									  .add(Restrictions.eq("idUsuario",idUsuario)).uniqueResult();
		if (administrador!=null)
			return true;
		else
			return false;
	}

}
