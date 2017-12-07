package ar.com.gestionpyme.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.gestionpyme.dao.CalleDao;
import ar.com.gestionpyme.modelo.Calle;

@Service("servicioCalle")
@Transactional
public class ServicioCalleImpl implements ServicioCalle{
	
	@Inject
	private CalleDao calleDao;
	
	public List<Calle> obtenerCalle(){
		return calleDao.obtenerCalle();
	}

}
