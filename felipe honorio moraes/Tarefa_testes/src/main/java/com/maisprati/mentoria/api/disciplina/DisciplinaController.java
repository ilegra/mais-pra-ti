package com.maisprati.mentoria.api.disciplina;

import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.service.disciplina.DisciplinaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;


    public DisciplinaController(DisciplinaService disciplinaService) { this.disciplinaService = disciplinaService; }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaModel> obter(@PathVariable Long id) {
        Optional<DisciplinaModel> disciplinaOptional = disciplinaService.obter(id);
        if (disciplinaOptional.isPresent()) {
            return ResponseEntity.ok(disciplinaOptional.get());
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisciplinaService> atualizar(@PathVariable Long id,
                                                       @RequestBody DisciplinaModel disciplinaInformada) {
        ResponseEntity<DisciplinaService> ok = (ResponseEntity<DisciplinaService>) ResponseEntity.ok(disciplinaService.atualizar(id, disciplinaInformada));
        return ok;
    }


}
