package com.robson.escola.service;

import com.robson.escola.model.Disciplina;
import com.robson.escola.model.Professor;
import com.robson.escola.repository.DisciplinaRepository;
import com.robson.escola.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DisciplinaService {
	private DisciplinaRepository repository;
	private ProfessorRepository professorRepository;

	public Disciplina create(Disciplina entity) {
		Professor professor = professorRepository.findByNome(entity.getProfessor().getNome());
		entity.setProfessor(professor);

		return repository.save(entity);
	}
}
