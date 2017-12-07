package ar.com.gestionpyme.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.gestionpyme.dao.SituacionDao;
import ar.com.gestionpyme.modelo.SituacionAfip;

@Service("servicioSituacion")
@Transactional
public class ServicioSituacionImpl implements ServicioSituacion{
	
	@Inject 
	private SituacionDao situacionDao;
	
	public List<SituacionAfip> obtenerSituacion(){
		return situacionDao.obtenerSituacion();
	}

}
