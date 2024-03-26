package com.robson.escola.repository;

import com.robson.escola.model.Disciplina;
import com.robson.escola.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
