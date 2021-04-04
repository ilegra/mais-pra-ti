package com.maisprati.mentoria.api.aluno;

import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.service.aluno.AlunoService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  private final AlunoService alunoService;
  public AlunoController(AlunoService alunoService) {
    this.alunoService = alunoService;
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
