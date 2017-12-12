package ar.com.gestionpyme.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.gestionpyme.modelo.Cliente;
import ar.com.gestionpyme.servicios.ServicioCalle;
import ar.com.gestionpyme.servicios.ServicioCliente;
import ar.com.gestionpyme.servicios.ServicioLocalidad;
import ar.com.gestionpyme.servicios.ServicioSituacion;

@Controller
public class ControladorCliente {
	
	@Inject
	private ServicioCliente servicioCliente;
	@Inject
	private ServicioSituacion servicioSituacion;
	@Inject 
	private ServicioCalle servicioCalle;
	@Inject 
	private ServicioLocalidad servicioLocalidad;
	
	@RequestMapping(path="/alta-clientes")
	public ModelAndView irAAltaCliente(){
		ModelMap modelo = new ModelMap();
		Cliente cliente = new Cliente();
		//Direccion direccion = new Direccion();
		modelo.put("cliente",cliente);
		//modelo.put("direccion",direccion);
		modelo.put("situacion",servicioSituacion.obtenerSituacion());
		modelo.put("calle",servicioCalle.obtenerCalle());
		modelo.put("localidad",servicioLocalidad.obtenerLocalidad());
		return new ModelAndView("alta-clientes",modelo);
	}
	

	@RequestMapping(path="/guardar-clientes",method=RequestMethod.POST)
	public ModelAndView guardarClientes(@ModelAttribute("cliente") Cliente cliente,
										HttpServletResponse response,
										HttpServletRequest request){
		ModelMap modelo = new ModelMap();
		request.getSession().setAttribute("usuario", request.getSession().getAttribute("usuario"));
		if(servicioCliente.guardarCliente(cliente)){
			modelo.put("mensaje", "Cliente Guardado con Exito");
			return new ModelAndView("principal",modelo);
		} else {
			modelo.put("mensaje", "Cliente No Fue Guardado");
			return new ModelAndView("principal",modelo);
		}
	}
	
	@RequestMapping("/principal")
	public ModelAndView irAPrincipal(HttpServletResponse response,HttpServletRequest request){
		request.getSession().setAttribute("usuario", request.getSession().getAttribute("usuario"));
		return new ModelAndView("redirect:/principal");
	}
	
}
