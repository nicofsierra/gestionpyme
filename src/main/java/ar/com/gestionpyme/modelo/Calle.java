package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Calle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCalle;
	private String descripcion;
	
	@OneToMany(mappedBy="calle")
	private List<CalleAltura> calleAltura = new ArrayList<>();
	
	public Calle(){
	}

	public Calle(Long idCalle, String descripcion, List<CalleAltura> calleAltura) {
		super();
		this.idCalle = idCalle;
		this.descripcion = descripcion;
		this.calleAltura = calleAltura;
	}

	public Long getIdCalle() {
		return idCalle;
	}

	public void setIdCalle(Long idCalle) {
		this.idCalle = idCalle;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<CalleAltura> getCalleAltura() {
		return calleAltura;
	}

	public void setCalleAltura(List<CalleAltura> calleAltura) {
		this.calleAltura = calleAltura;
	}
	
}
