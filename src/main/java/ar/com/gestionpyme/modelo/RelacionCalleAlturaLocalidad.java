package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RelacionCalleAlturaLocalidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRelacion;
	
	@OneToMany(mappedBy="relacionCalleAlturaLocalidad")
	private List<CalleAltura> calleAltura = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="localidad")
	private Localidad localidad;
	
	public RelacionCalleAlturaLocalidad(){}

	public RelacionCalleAlturaLocalidad(Long idRelacion, List<CalleAltura> calleAltura, Localidad localidad) {
		super();
		this.idRelacion = idRelacion;
		this.calleAltura = calleAltura;
		this.localidad = localidad;
	}

	public Long getIdRelacion() {
		return idRelacion;
	}

	public void setIdRelacion(Long idRelacion) {
		this.idRelacion = idRelacion;
	}

	public List<CalleAltura> getCalleAltura() {
		return calleAltura;
	}

	public void setCalleAltura(List<CalleAltura> calleAltura) {
		this.calleAltura = calleAltura;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

}
