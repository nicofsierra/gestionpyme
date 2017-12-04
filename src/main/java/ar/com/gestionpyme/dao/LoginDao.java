package ar.com.gestionpyme.dao;

import ar.com.gestionpyme.modelo.Usuario;

public interface LoginDao {
	
	Usuario buscarUsuario(String email,String password);
	
	Boolean validarAdministrador(Long idUsuario);

}
