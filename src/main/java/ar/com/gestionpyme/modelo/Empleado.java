package ar.com.gestionpyme.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
public class Empleado extends Usuario{
	
	private Integer legajo;
	@ManyToOne
	@JoinColumn(name="idAdm")
	private Administrador idAdm;
	
	public Empleado(){
		super();
	}

	public Empleado(Integer legajo, Administrador idAdm) {
		super();
		this.legajo = legajo;
		this.idAdm = idAdm;
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
	
}
