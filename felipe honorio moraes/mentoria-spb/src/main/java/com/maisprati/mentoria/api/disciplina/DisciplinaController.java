package com.maisprati.mentoria.api.disciplina;

import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.service.disciplina.DisciplinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("/disciplina")
public class DisciplinaController{

    private final DisciplinaService DisciplinaService;
    public DisciplinaController(DisciplinaService disciplinaService) { this.DisciplinaService = disciplinaService; }


    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaModel> obter(@PathVariable Long id) {
        Optional<DisciplinaModel> DisciplinaOptional = DisciplinaService.obter(id);
        if (DisciplinaOptional.isPresent()) {
            return ResponseEntity.ok(DisciplinaOptional.get());
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("")
    public ResponseEntity<List<DisciplinaModel>> obter(@RequestParam String nome) {
        return ResponseEntity.ok(DisciplinaService.obterPorNome(nome));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisciplinaModel> atualizar(@PathVariable Long id,
                                                @RequestBody DisciplinaModel disciplinaInformada) {
        return ResponseEntity.ok(DisciplinaService.atualizar(id, disciplinaInformada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DisciplinaModel> excluir(@PathVariable Long id) {
        DisciplinaService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/")
    public ResponseEntity<DisciplinaModel> incluir(@RequestBody DisciplinaModel disciplinaInformada) {
        return ResponseEntity.status(HttpStatus.CREATED).body(DisciplinaService.incluir(disciplinaInformada));
    }

}
