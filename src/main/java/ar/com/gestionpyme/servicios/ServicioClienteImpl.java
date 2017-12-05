package ar.com.gestionpyme.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.gestionpyme.dao.ClienteDao;
import ar.com.gestionpyme.modelo.Cliente;

@Service("servicioCliente")
@Transactional
public class ServicioClienteImpl implements ServicioCliente{
	@Inject 
	private ClienteDao clienteDao;
	
	public Boolean guardarCliente(Cliente cliente){
		return clienteDao.guardarCliente(cliente);
	}
}
