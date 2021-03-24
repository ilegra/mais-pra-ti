package com.maisprati.desafiospring.api.aluno;

import com.maisprati.desafiospring.domain.aluno.AlunoModel;
import com.maisprati.desafiospring.service.aluno.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoService alunoService;

  @GetMapping("/all")
  public ResponseEntity<List<AlunoModel>> findAll() {
    return ResponseEntity
            .ok(alunoService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<AlunoModel> obter(@PathVariable Long id) {
    Optional<AlunoModel> alunoOptional = alunoService.obter(id);
    if (alunoOptional.isPresent()) {
      return ResponseEntity.ok(alunoOptional.get());
    }
    return ResponseEntity.noContent().build();
  }

  @GetMapping("")
  public ResponseEntity<List<AlunoModel>> obter(@RequestParam String nome) {
    return ResponseEntity.ok(alunoService.obterPorNome(nome));
  }

  @PutMapping("/{id}")
  public ResponseEntity<AlunoModel> atualizar(@PathVariable Long id,
      @RequestBody AlunoModel alunoInformado) {
    return ResponseEntity.ok(alunoService.atualizar(id, alunoInformado));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<AlunoModel> excluir(@PathVariable Long id) {
    alunoService.excluir(id);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/")
  public ResponseEntity<AlunoModel> incluir(@RequestBody AlunoModel alunoInformado) {
    return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.incluir(alunoInformado));
  }

}
