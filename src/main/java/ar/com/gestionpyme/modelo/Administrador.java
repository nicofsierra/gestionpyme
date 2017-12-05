package ar.com.gestionpyme.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Administrador extends Usuario{
	
	private Boolean externo;
	@OneToMany(mappedBy="idAdm")
	private List<Empleado> empleado = new ArrayList<>();

	@OneToMany(mappedBy="administrador")
	private List<Producto> producto = new ArrayList<>();
	
	public Administrador(){
		super();
	}
	
	public Administrador(Boolean externo, List<Empleado> empleado, List<Producto> producto) {
		super();
		this.externo = externo;
		this.empleado = empleado;
		this.producto = producto;
	}

	public Boolean getExterno() {
		return externo;
	}

	public void setExterno(Boolean externo) {
		this.externo = externo;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
}
