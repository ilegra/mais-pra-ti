package com.maisprati.mentoria.domain.disciplina;

import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.service.disciplina.DisciplinaService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DisciplinaRepository  extends PagingAndSortingRepository<DisciplinaModel, Long> {
    Optional<DisciplinaModel> findById(Long id);
    List<DisciplinaModel> findAllByNomeContaining(String nome);
    //DisciplinaService save(DisciplinaModel disciplinaInformada);
}
