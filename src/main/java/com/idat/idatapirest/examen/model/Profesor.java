package com.idat.idatapirest.examen.model;

import java.io.Serializable;

public class Profesor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6573237964679857797L;
	private Integer idProfesor;
	private String Profesor;
	
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return Profesor;
	}
	public void setProfesor(String profesor) {
		Profesor = profesor;
	}

	
}
