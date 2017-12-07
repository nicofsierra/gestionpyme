package ar.com.gestionpyme.dao;

import java.util.List;

import ar.com.gestionpyme.modelo.SituacionAfip;

public interface SituacionDao {

	List<SituacionAfip> obtenerSituacion();
}
