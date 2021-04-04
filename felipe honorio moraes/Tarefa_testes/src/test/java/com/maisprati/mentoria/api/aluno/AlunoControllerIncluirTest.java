package com.maisprati.mentoria.api.aluno;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.domain.aluno.AlunoRepository;
import com.maisprati.mentoria.service.aluno.AlunoService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AlunoController.class)
class AlunoControllerIncluirTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  @SpyBean
  private AlunoService alunoService;

  @MockBean
  private AlunoRepository alunoRepository;

  private List<AlunoModel> alunos = new ArrayList<>();

  @BeforeEach
  void setUp(){
    AlunoModel alunoTestador = new AlunoModel();
    alunoTestador.setId(99L);
    alunoTestador.setNome("Papai Noel");
    alunoTestador.setNascimento(LocalDate.now());
    alunos.add(alunoTestador);

    AlunoModel alunoSeguinte = new AlunoModel();
    alunoSeguinte.setId(21L);
    alunoSeguinte.setNome("Ben Johnson");
    alunoSeguinte.setNascimento(LocalDate.now());
    alunos.add(alunoSeguinte);
  }

  @Test
  void deveDarErroAoIncluirPoisContemId() throws Exception {
    AlunoModel novoAluno = new AlunoModel();
    novoAluno.setId(171L);
    novoAluno.setNome("Forrest Gump");
    novoAluno.setNascimento(LocalDate.now());

    MvcResult mvcResult = mockMvc.perform(post("/alunos/")
        .contentType("application/json")
        .content(objectMapper.writeValueAsString(novoAluno)))
        .andExpect(status().isBadRequest())
        .andReturn();

    String actualResponseBody =
        mvcResult.getResolvedException().getMessage();
    assertThat(actualResponseBody)
        .isEqualToIgnoringWhitespace("Erro em objeto do tipo Aluno ao executar incluir com id 171.");
  }

  @Test
  void deveIncluirPoisNaoContemId() throws Exception {
    AlunoModel novoAlunoSemId = new AlunoModel();
    novoAlunoSemId.setNome("Forrest Gump");
    novoAlunoSemId.setNascimento(LocalDate.now());

    mockMvc.perform(post("/alunos/")
        .contentType("application/json")
        .content(objectMapper.writeValueAsString(novoAlunoSemId)))
        .andExpect(status().isCreated());
  }
}