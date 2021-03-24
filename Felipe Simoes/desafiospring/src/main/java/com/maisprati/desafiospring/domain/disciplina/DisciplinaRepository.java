package com.maisprati.desafiospring.domain.disciplina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<DisciplinaModel, Long> {

    @Query(
            value = "SELECT * FROM disciplina WHERE disciplina.criado_em >= CURRENT_TIMESTAMP -1",
            nativeQuery = true)
    List<DisciplinaModel> findByLastHour();
}
