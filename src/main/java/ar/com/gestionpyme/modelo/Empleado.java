/*package ar.com.gestionPyme.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Empleado extends Usuario{
	
	private Integer legajo;
	@ManyToOne
	@JoinColumn(name="idEmpleado")
	private Long idEmpleado;
	
	public Empleado(){
		super();
	}

	public Empleado(Integer legajo, Long idEmpleado) {
		super();
		this.legajo = legajo;
		this.idEmpleado = idEmpleado;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
}*/
