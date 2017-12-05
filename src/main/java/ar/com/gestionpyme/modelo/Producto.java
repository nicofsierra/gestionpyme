package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	private String descripcion;
	private Float precio_unitario;
	
	@ManyToMany(mappedBy="producto")
	private List<Factura> factura = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="administrador")
	private Administrador administrador;
	
	@OneToOne
	@JoinColumn(name="stock")
	private Stock stock; 
	
	public Producto(){}

	public Producto(Long idProducto, String descripcion, Float precio_unitario, List<Factura> factura,
			Administrador administrador, Stock stock) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
		this.factura = factura;
		this.administrador = administrador;
		this.stock = stock;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(Float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
