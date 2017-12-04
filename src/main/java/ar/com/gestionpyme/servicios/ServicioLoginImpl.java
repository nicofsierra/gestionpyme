package ar.com.gestionpyme.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.gestionpyme.dao.LoginDao;
import ar.com.gestionpyme.modelo.Usuario;

@Service("servicioLogin")
@Transactional
public class ServicioLoginImpl implements ServicioLogin{
	
	@Inject
	private LoginDao loginDao;
	
	@Override
	public Usuario validarLogin(String email,String password){
		
		return loginDao.buscarUsuario(email, password);
	}
	
	@Override
	public Boolean validarAdministrador(Long idUsuario){
		
	}
	
	

}
