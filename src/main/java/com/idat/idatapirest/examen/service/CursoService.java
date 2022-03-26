package com.idat.idatapirest.examen.service;

import java.util.List;

import com.idat.idatapirest.examen.dto.CursoRequestDTO;
import com.idat.idatapirest.examen.model.Curso;

public interface CursoService {
	public void guardarCurso(CursoRequestDTO c);
	public void eliminarCurso(Integer id);
	public void editarCurso(CursoRequestDTO c);
	public List<CursoRequestDTO> listarCursos();
	public CursoRequestDTO cursoById(Integer id);
}
