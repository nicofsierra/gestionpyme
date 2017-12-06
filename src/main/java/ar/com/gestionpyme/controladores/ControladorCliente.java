package ar.com.gestionpyme.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.gestionpyme.modelo.Cliente;
import ar.com.gestionpyme.servicios.ServicioCliente;

@Controller
public class ControladorCliente {
	
	@Inject
	private ServicioCliente servicioCliente;
	
	@RequestMapping(path="/alta-clientes")
	public ModelAndView irAAltaCliente(){
		ModelMap modelo = new ModelMap();
		Cliente cliente = new Cliente();
		modelo.put("cliente",cliente);
		return new ModelAndView("alta-clientes",modelo);
	}
	

	@RequestMapping(path="/guarda-clientes",method=RequestMethod.POST)
	public ModelAndView guardarClientes(@ModelAttribute("cliente") Cliente cliente){
		ModelMap modelo = new ModelMap();
		if(servicioCliente.guardarCliente(cliente)){
			modelo.put("mensaje", "Cliente Guardado con Exito");
			return new ModelAndView("index",modelo);
		} else {
			modelo.put("mensaje", "Cliente No Fue Guardado");
			return new ModelAndView("index",modelo);
		}
	}
	
	@RequestMapping("/principal")
	public ModelAndView irAPrincipal(){
		return new ModelAndView("redirect:/principal");
	}
	
}
