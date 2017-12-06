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
public class Localidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocalidad;
	private String descripcion;
	
	@OneToMany(mappedBy="localidad")
	private List<RelacionCalleAlturaLocalidad> relacionCalleAlturaLocalidad = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="partido")
	private Partido partido;
	
	public Localidad(){}

	public Localidad(Long idLocalidad, String descripcion, List<RelacionCalleAlturaLocalidad> relacionCalleAlturaLocalidad, Partido partido) {
		super();
		this.idLocalidad = idLocalidad;
		this.descripcion = descripcion;
		this.relacionCalleAlturaLocalidad = relacionCalleAlturaLocalidad;
		this.partido = partido;
	}

	public Long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<RelacionCalleAlturaLocalidad> getrelacionCalleAlturaLocalidad() {
		return relacionCalleAlturaLocalidad;
	}

	public void setrelacionCalleAlturaLocalidad(List<RelacionCalleAlturaLocalidad> relacionCalleAlturaLocalidad) {
		this.relacionCalleAlturaLocalidad = relacionCalleAlturaLocalidad;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
}
