package com.robson.escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(unique = true)
	String nome;

	@OneToOne
	@JoinColumn(name = "professor_id")
	Professor professor;

	@ManyToMany
	@JoinTable(name = "DISCIPLINA_ALUNO",
			joinColumns = @JoinColumn(name = "ID_DISCIPLINA"),
			inverseJoinColumns = @JoinColumn(name = "ID_ALUNO"))
	List<Aluno> alunos;
}
