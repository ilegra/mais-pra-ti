package com.maisprati.mentoria.domain.disciplina;

import com.maisprati.mentoria.domain.aluno.AlunoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface DisciplinaRepository  extends CrudRepository<DisciplinaModel, Long>  {

    List<DisciplinaModel> findAllByNomeContaining(String nome);


    //@Query("SELECT  * FROM  Disciplina WHERE Data >= NOW() - INTERVAL 60 MINUTE")
    //List<DisciplinaModel> findByFilipeQuery(String nome);
}
