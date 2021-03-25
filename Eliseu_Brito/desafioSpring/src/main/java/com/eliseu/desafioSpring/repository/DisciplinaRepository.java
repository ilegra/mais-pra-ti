package com.eliseu.desafioSpring.repository;

import com.eliseu.desafioSpring.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query(value = "SELECT * FROM DISCIPLINA where Criado_Em > :creationDateTime", nativeQuery = true)
    List<Disciplina> findAllCriadosUltimaHora(@Param("creationDateTime") Date creationDateTime);
}
