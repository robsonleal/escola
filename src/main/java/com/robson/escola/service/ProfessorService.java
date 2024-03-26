package com.robson.escola.service;

import com.robson.escola.model.Professor;
import com.robson.escola.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProfessorService {
	private ProfessorRepository repository;

	public Professor create(Professor entity) {
		return repository.save(entity);
	}
}
