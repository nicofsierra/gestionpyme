package ar.com.gestionpyme.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDireccion;
	private String calle;
	private Integer numero;
	private Integer piso;
	private Integer dpto;
	private String entreCalle1;
	private String entreCalle2;
	
	@OneToOne(mappedBy="direccion")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="localidad")
	private Localidad localidad;
	
	public Direccion(){}

	public Direccion(Long idDireccion, String calle, Integer numero, Integer piso, Integer dpto, String entreCalle1,
			String entreCalle2, Cliente cliente, Localidad localidad) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dpto = dpto;
		this.entreCalle1 = entreCalle1;
		this.entreCalle2 = entreCalle2;
		this.cliente = cliente;
		this.localidad = localidad;
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getDpto() {
		return dpto;
	}

	public void setDpto(Integer dpto) {
		this.dpto = dpto;
	}

	public String getEntreCalle1() {
		return entreCalle1;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public String getEntreCalle2() {
		return entreCalle2;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
}
