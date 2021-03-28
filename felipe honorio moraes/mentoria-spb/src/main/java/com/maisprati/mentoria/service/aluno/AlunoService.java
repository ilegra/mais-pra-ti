package com.maisprati.mentoria.service.aluno;

import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.domain.aluno.AlunoRepository;
import com.maisprati.mentoria.exception.MentoriaException;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class AlunoService {

  private final AlunoRepository alunoRepository;

  public AlunoService(AlunoRepository alunoRepository) {
    this.alunoRepository = alunoRepository; }

  public Optional<AlunoModel> obter(Long id) {
    return this.alunoRepository
        .findById(id);
  }

  public AlunoModel incluir(AlunoModel alunoInformado) {
    if(alunoInformado.getId() != null){
      throw new MentoriaException("Aluno", "incluir");
    }

    return this.alunoRepository.save(alunoInformado);
  }


  public AlunoModel atualizar(Long id, AlunoModel alunoInformado) {
    AlunoModel alunoAtualizado = obter(id).orElseThrow(() -> new MentoriaException("Aluno", "atualizar", id));
    alunoAtualizado.setNome(alunoInformado.getNome());
    return this.alunoRepository.save(alunoAtualizado);
  }

  public void excluir(Long id) {
    this.alunoRepository.deleteById(id);
  }

  public List<AlunoModel> obterPorNome(String nome) {
    return this.alunoRepository
        .findAllByNomeContaining(nome);
  }





}
