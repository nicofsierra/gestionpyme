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
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nombre;
	private String cuit;
	private String telefono;
	
	@OneToMany(mappedBy="cliente")
	private List<Factura> factura = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="situacion")
	private SituacionAfip situacion;
	
	@ManyToOne
	@JoinColumn(name="empleado")
	private Empleado empleado;
	
	@OneToOne
	@JoinColumn(name="direccion")
	private Direccion direccion;
	
	public Cliente(){}

	public Cliente(Long idCliente, String nombre, String cuit, String telefono, List<Factura> factura,
			SituacionAfip situacion, Empleado empleado, Direccion direccion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.cuit = cuit;
		this.telefono = telefono;
		this.factura = factura;
		this.situacion = situacion;
		this.empleado = empleado;
		this.direccion = direccion;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public SituacionAfip getSituacion() {
		return situacion;
	}

	public void setSituacion(SituacionAfip situacion) {
		this.situacion = situacion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
