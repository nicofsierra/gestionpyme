package ar.com.gestionpyme.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.gestionpyme.modelo.Usuario;

@Controller
public class ControladorLogin {
	
	@RequestMapping(path = " / ")
	public ModelAndView irAIndex(){
		return new ModelAndView("redirect:/index");
	}
	
	/*@RequestMapping(path="/login",method=RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("usuarioLogin") Usuario usuario){
		
		return 
	}*/
	
	

}
