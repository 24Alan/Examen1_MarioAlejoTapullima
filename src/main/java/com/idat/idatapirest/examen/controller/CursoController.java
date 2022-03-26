package com.idat.idatapirest.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.examen.dto.CursoRequestDTO;
import com.idat.idatapirest.examen.model.Curso;
import com.idat.idatapirest.examen.service.CursoServiceImpl;


@RestController
@RequestMapping("/curso/v1")
public class CursoController {
	
	@Autowired
	private CursoServiceImpl service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<CursoRequestDTO>>listar(){
		
		return new ResponseEntity<List<CursoRequestDTO>>(service.listarCursos(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody CursoRequestDTO curso){
		service.guardarCurso(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<CursoRequestDTO> cursoById(@PathVariable Integer id){
		Curso curso = service.cursoById(id);
		if(curso != null) {
			return new ResponseEntity<CursoRequestDTO>(curso, HttpStatus.OK);

		}
		return new ResponseEntity<CursoRequestDTO>(HttpStatus.NOT_FOUND);

	}
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Curso curso = service.cursoById(id);
		if(curso != null) {
			service.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody CursoRequestDTO curso){
		Curso curso2 = service.cursoById(curso.getIdResquest());
		if(curso != null) {
			service.editarCurso(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
