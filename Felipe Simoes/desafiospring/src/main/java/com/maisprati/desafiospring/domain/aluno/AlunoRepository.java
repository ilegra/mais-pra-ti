package com.maisprati.desafiospring.domain.aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

  List<AlunoModel> findAllByNomeContaining(String nome);

  //@Query("")
  //List<AlunoModel> findByFilipeQuery(String nome);
}
