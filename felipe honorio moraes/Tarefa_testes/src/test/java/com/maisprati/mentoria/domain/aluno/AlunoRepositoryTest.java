package com.maisprati.mentoria.domain.aluno;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AlunoRepositoryTest {

  @Autowired
  private AlunoRepository alunoRepository;
  private AlunoModel alunoPrimeiro, alunoSegundo;
  private List<AlunoModel> alunoList;

  @BeforeEach
  void setUp() {
    AlunoModel alunoTestador = new AlunoModel();
    alunoTestador.setId(1L);
    alunoTestador.setNome("Testador Um");
    alunoTestador.setNascimento(LocalDate.now());

    AlunoModel alunoSeguinte = new AlunoModel();
    alunoSeguinte.setId(2L);
    alunoSeguinte.setNome("Seguinte Um");
    alunoSeguinte.setNascimento(LocalDate.now());

    alunoRepository.save(alunoTestador);
    alunoRepository.save(alunoSeguinte);
  }

  @AfterEach
  void tearDown() {
    alunoRepository.deleteAll();
  }

  @Test
  void deveListarTodosAlunos() {
    Iterable<AlunoModel> result = alunoRepository.findAll();
    assertThat(result).isNotNull();
    assertThat(result).hasSize(22);
  }

  @Test
  void deveEncontrarUmAlunoComNomeIgual() {
    Iterable<AlunoModel> result = alunoRepository.findByFilipeQuery("Seguinte Um");
    assertThat(result).isNotNull();
    assertThat(result).hasSize(1);

    Optional<AlunoModel> alunoOptional = StreamSupport.stream(result.spliterator(), false)
        .findAny();

    assertThat(alunoOptional.map(AlunoModel::getNascimento)).isNotEmpty();
    assertThat(alunoOptional.map(AlunoModel::getNascimento).get()).isToday();
  }

  @Test
  void deveEncontrarVinteAlunosComNomeContendoHeleno() {
    Iterable<AlunoModel> result = alunoRepository.findAllByNomeContaining("Heleno");
    assertThat(result).isNotNull();
    assertThat(result).hasSize(20);
  }
}