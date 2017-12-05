package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Empleado extends Usuario{
	
	private Integer legajo;
	
	@ManyToOne
	@JoinColumn(name="idAdm")
	private Administrador idAdm;
	
	@OneToMany(mappedBy="empleado")
	private List<Cliente> cliente = new ArrayList<>();
	
	@OneToMany(mappedBy="empleado")
	private List<Factura> factura = new ArrayList<>();
	
	public Empleado(){
		super();
	}

	public Empleado(Integer legajo, Administrador idAdm, List<Cliente> cliente, List<Factura> factura) {
		super();
		this.legajo = legajo;
		this.idAdm = idAdm;
		this.cliente = cliente;
		this.factura = factura;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Administrador getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(Administrador idAdm) {
		this.idAdm = idAdm;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}
	
}
