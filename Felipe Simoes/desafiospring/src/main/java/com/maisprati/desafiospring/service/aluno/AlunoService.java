package com.maisprati.desafiospring.service.aluno;

import com.maisprati.desafiospring.domain.aluno.AlunoModel;
import com.maisprati.desafiospring.domain.aluno.AlunoRepository;
import com.maisprati.desafiospring.exception.BadRequestException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

  @Autowired
  private AlunoRepository alunoRepository;

  public List<AlunoModel> findAll() {
    return alunoRepository.findAll();
  }

  public Optional<AlunoModel> obter(Long id) {
    verifyIfAlunoExistsById("buscar","Aluno", id);
    return alunoRepository.findById(id);
  }

  public AlunoModel incluir(AlunoModel alunoInformado) {
    return alunoRepository.save(alunoInformado);
  }

  public AlunoModel atualizar(Long id, AlunoModel alunoInformado) {
    AlunoModel alunoAtualizado = verifyIfAlunoExistsById("atualizar", "Aluno", id);
    alunoAtualizado.setNome(alunoInformado.getNome());
    return alunoRepository.save(alunoAtualizado);
  }

  public void excluir(Long id) {
    verifyIfAlunoExistsById("apagar","Aluno", id);
    alunoRepository.deleteById(id);
  }

  public List<AlunoModel> obterPorNome(String name) {
    return alunoRepository.findAllByNomeContaining(name);
  }

  public AlunoModel verifyIfAlunoExistsById(String action, String typeObject, Long id) throws BadRequestException {
    return alunoRepository.findById(id)
            .orElseThrow(() -> new BadRequestException(action, typeObject, id));
  }

}
