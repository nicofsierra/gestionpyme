package ar.com.gestionpyme.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.com.gestionpyme.modelo.Usuario;
import ar.com.gestionpyme.servicios.ServicioLogin;

@Controller
public class ControladorLogin {
	
	@Inject
	private ServicioLogin servicioLogin;
	
	@RequestMapping(path = "/")
	public ModelAndView inicio(){
		return new ModelAndView("redirect:/index");
	}
	
	@RequestMapping(path="/index")
	public ModelAndView irAIndex(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ModelAndView validarLogin(@RequestParam("email") String email,
									 @RequestParam("pwd") String pwd , HttpServletRequest request){
		ModelMap modelo = new ModelMap();
		Usuario usuario = servicioLogin.buscarUsuario(email, pwd);
		if( usuario != null ){
			request.getSession().setAttribute("usuario", usuario);
			if(servicioLogin.validarAdministrador(usuario.getIdUsuario())){
				modelo.put("administrador",usuario);
				return new ModelAndView("administrar",modelo);
			}
			else{
				modelo.put("empleado",usuario);
				return new ModelAndView("principal",modelo);
				}
			}
		else{
			modelo.put("error", "El usuario es incorrecto");
			return new ModelAndView("index",modelo);
		}
	
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request){
		request.getSession().removeAttribute("usuario");
		return new ModelAndView("redirect:/index");
	}
	
	

}
