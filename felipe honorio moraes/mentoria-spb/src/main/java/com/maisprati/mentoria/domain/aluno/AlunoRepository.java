package com.maisprati.mentoria.domain.aluno;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<AlunoModel, Long> {

  List<AlunoModel> findAllByNomeContaining(String nome);

  //@Query("SELECT a FROM aluno a WHERE a.nome = :nome")
  //List<AlunoModel> findByFilipeQuery(String nome);
}
