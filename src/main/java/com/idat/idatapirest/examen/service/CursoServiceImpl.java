package com.idat.idatapirest.examen.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.examen.dto.CursoRequestDTO;
import com.idat.idatapirest.examen.dto.CursoResponseDTO;
import com.idat.idatapirest.examen.model.Curso;
import com.idat.idatapirest.examen.repository.CursoRepository;


public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repository;
	@Override
	public void guardarCurso(CursoRequestDTO c) {
		Curso curso=new Curso();
		curso.setIdCurso(c.getIdResquest());
		curso.setCurso(c.getNombreCurso());
		curso.setDescripcion(c.getDescripcionCurso());
		curso.setIdMalla(c.getIdMallaCurso());
		repository.save(curso);
		
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void editarCurso(CursoRequestDTO c) {
		Curso curso=new Curso();
		curso.setIdCurso(c.getIdResquest());
		curso.setCurso(c.getNombreCurso());
		curso.setDescripcion(c.getDescripcionCurso());
		curso.setIdMalla(c.getIdMallaCurso());
		repository.saveAndFlush(curso);
	}

	@Override
	public List<CursoRequestDTO> listarCursos() {
		 List<CursoResponseDTO> dto = new ArrayList<CursoResponseDTO>();
		 List<Curso> curso=repository.findAll();
		 CursoResponseDTO cursoDto= null;
		 
		 for (Curso curso2 : curso) {
			 	cursoDto =new CursoResponseDTO();
			 	cursoDto.setIdResponse(curso2.getIdCurso());
				cursoDto.setNombreCurso(curso2.getCurso());
				cursoDto.setDescripcionCurso(curso2.getDescripcion());
				cursoDto.setIdMallaCurso(curso2.getIdMalla());
				dto.add(null);
		}
		
		return dto;
		
	}

	@Override
	public CursoResponseDTO cursoById(Integer id) {
		Curso curso = repository.findById(id).orElse(null);
		CursoResponseDTO cursoDto = new CursoResponseDTO();
		
		cursoDto= new CursoResponseDTO();
		cursoDto =new CursoResponseDTO();
	 	cursoDto.setIdResponse(curso.getIdCurso());
		cursoDto.setNombreCurso(curso.getCurso());
		cursoDto.setDescripcionCurso(curso.getDescripcion());
		cursoDto.setIdMallaCurso(curso.getIdMalla());
		return cursoDto;
	}

	

}
