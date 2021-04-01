package com.maisprati.mentoria.api.aluno;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.service.aluno.AlunoService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AlunoController.class)
class AlunoControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  @MockBean
  private AlunoService alunoService;

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
  void devePesquisarPorNomeENaoRetornarNada() throws Exception {
    mockMvc.perform(get("/alunos")
        .param("nome", "Giuseppe")
        .contentType("application/json"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(0)));
  }

  @Test
  void devePesquisarPorNomeERetornarDoisAlunos() throws Exception {
    when(alunoService.obterPorNome(any())).thenReturn(alunos);
    mockMvc.perform(get("/alunos")
        .param("nome", "Giuseppe")
        .contentType("application/json"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(2)))
        .andExpect(jsonPath("$[0].id", is(99)))
        .andExpect(jsonPath("$[1].nome", is("Ben Johnson")));
  }




}