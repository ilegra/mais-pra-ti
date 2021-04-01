package com.maisprati.mentoria.domain.aluno;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends PagingAndSortingRepository<AlunoModel, Long> {

  List<AlunoModel> findAllByNomeContaining(String nome);

  @Override
  <S extends AlunoModel> S save(S entity);
}
