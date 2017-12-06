package ar.com.gestionpyme.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CalleAltura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCalleAltura;
	private Integer altura;
	
	@OneToOne(mappedBy="calleAltura")
	private Direccion direccion;
	
	@ManyToOne
	@JoinColumn(name="calle")
	private Calle calle;
	
	@ManyToOne
	@JoinColumn(name="relacionCalleAlturaLocalidad")
	private RelacionCalleAlturaLocalidad relacionCalleAlturaLocalidad;
	
	public CalleAltura(){}

	public CalleAltura(Long idCalleAltura, Integer altura, Calle calle,
			RelacionCalleAlturaLocalidad relacionCalleAlturaLocalidad) {
		super();
		this.idCalleAltura = idCalleAltura;
		this.altura = altura;
		this.calle = calle;
		this.relacionCalleAlturaLocalidad = relacionCalleAlturaLocalidad;
	}

	public Long getIdCalleAltura() {
		return idCalleAltura;
	}

	public void setIdCalleAltura(Long idCalleAltura) {
		this.idCalleAltura = idCalleAltura;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}

	public RelacionCalleAlturaLocalidad getRelacionCalleAlturaLocalidad() {
		return relacionCalleAlturaLocalidad;
	}

	public void setRelacionCalleAlturaLocalidad(RelacionCalleAlturaLocalidad relacionCalleAlturaLocalidad) {
		this.relacionCalleAlturaLocalidad = relacionCalleAlturaLocalidad;
	}

}
