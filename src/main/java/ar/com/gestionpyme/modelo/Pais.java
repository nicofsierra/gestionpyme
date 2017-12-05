package ar.com.gestionpyme.modelo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProvincia;
	private String descripcion;
	
	@OneToMany(mappedBy="pais")
	private List<Provincia> provincia = new ArrayList<>();
	
	public Pais(){}

	public Pais(Long idProvincia, String descripcion, List<Provincia> provincia) {
		super();
		this.idProvincia = idProvincia;
		this.descripcion = descripcion;
		this.provincia = provincia;
	}

	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Provincia> getProvincia() {
		return provincia;
	}

	public void setProvincia(List<Provincia> provincia) {
		this.provincia = provincia;
	}
		
}
