package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFactura;
	private Integer cantidad;
	private Float importe;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="tipo")
	private TipoFactura tipo;
	
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="empleado")
	private Empleado empleado;
	
	@ManyToMany
	@JoinTable(
	        name = "Factura_Producto", 
	        joinColumns = { @JoinColumn(name = "factura") }, 
	        inverseJoinColumns = { @JoinColumn(name = "producto") }
	    )
	private List<Producto> producto = new ArrayList<>();
	
	public Factura(){}

	public Factura(Long idFactura, Integer cantidad, Float importe, Date fecha, TipoFactura tipo, Cliente cliente,
			Empleado empleado, List<Producto> producto) {
		super();
		this.idFactura = idFactura;
		this.cantidad = cantidad;
		this.importe = importe;
		this.fecha = fecha;
		this.tipo = tipo;
		this.cliente = cliente;
		this.empleado = empleado;
		this.producto = producto;
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoFactura getTipo() {
		return tipo;
	}

	public void setTipo(TipoFactura tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

}
