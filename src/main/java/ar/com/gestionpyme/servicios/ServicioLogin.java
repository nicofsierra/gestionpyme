package ar.com.gestionpyme.servicios;

import ar.com.gestionpyme.modelo.Usuario;

public interface ServicioLogin {
	
	Usuario validarLogin(String email , String password);
	Boolean validarAdministrador(Long idUsuario);

}
