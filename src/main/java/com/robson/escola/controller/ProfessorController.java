package com.robson.escola.controller;

import com.robson.escola.model.Professor;
import com.robson.escola.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/professores")
public class ProfessorController {
	private ProfessorService service;

	@PostMapping
	public ResponseEntity<Professor> create(@RequestBody Professor entity) {
		Professor newProfessor = service.create(entity);

		return ResponseEntity.ok(newProfessor);
	}
}
