package com.idat.idatapirest.examen.model;

import java.io.Serializable;

public class Universidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7900357319066841101L;
	
	private Integer idUniversidad;
	private String Universidad;
	
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	
}
