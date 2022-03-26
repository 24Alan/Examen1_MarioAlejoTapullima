package com.idat.idatapirest.examen.model;

import java.io.Serializable;

public class MallaCuricular implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4499361988992298228L;
	
	private Integer idMalla;
	private Integer año;
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	
	
}
