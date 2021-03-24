package com.maisprati.desafiospring.api.disciplina;

import com.maisprati.desafiospring.domain.disciplina.DisciplinaModel;
import com.maisprati.desafiospring.exception.BadRequestException;
import com.maisprati.desafiospring.service.disciplina.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/all")
    public ResponseEntity<List<DisciplinaModel>> findAll() {
        return ResponseEntity
                .ok(disciplinaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DisciplinaModel>> findById(@PathVariable Long id) throws BadRequestException {
        return ResponseEntity
                .ok(disciplinaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<DisciplinaModel> createDisciplina(@RequestBody DisciplinaModel disciplinaModel) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(disciplinaService.createDisciplina(disciplinaModel));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) throws BadRequestException {
        disciplinaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisciplinaModel> updateDisciplina(@PathVariable Long id,
                                                            @RequestBody DisciplinaModel disciplinaAtualizada)
            throws BadRequestException {
        return ResponseEntity.ok(disciplinaService.updateDisciplina(id, disciplinaAtualizada));
    }

    @GetMapping("/lasthour")
    public List<DisciplinaModel> findByLastHour() {
        return disciplinaService.findByLastHour();
    }
}
