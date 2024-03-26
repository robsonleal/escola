package com.robson.escola.repository;

import com.robson.escola.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	Professor findByNome(String name);
}
