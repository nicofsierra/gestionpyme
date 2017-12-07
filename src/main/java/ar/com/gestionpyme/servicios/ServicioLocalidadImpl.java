package ar.com.gestionpyme.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.gestionpyme.dao.LocalidadDao;
import ar.com.gestionpyme.modelo.Localidad;

@Service("servicioLocalidad")
@Transactional
public class ServicioLocalidadImpl implements ServicioLocalidad{
	
	@Inject
	private LocalidadDao localidadDao;
	
	public List<Localidad> obtenerLocalidad(){
		return localidadDao.obtenerLocalidad();
	}

}
