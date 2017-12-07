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
	private List<Direccion> direccion = new ArrayList<>();
	
	public Calle(){
	}

	public Calle(Long idCalle, String descripcion, List<Direccion> direccion) {
		super();
		this.idCalle = idCalle;
		this.descripcion = descripcion;
		this.direccion = direccion;
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

	public List<Direccion> getdireccion() {
		return direccion;
	}

	public void setdireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
	
}
