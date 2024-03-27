package com.robson.escola.controller;

import com.robson.escola.model.Disciplina;
import com.robson.escola.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplinas")
public class DisciplinaController {
	private DisciplinaService service;

	@PostMapping
	public ResponseEntity<Disciplina> create(@RequestBody Disciplina entity) {
		Disciplina newDisplina = service.create(entity);
		return ResponseEntity.ok(newDisplina);
	}
}
