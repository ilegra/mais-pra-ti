package com.eliseu.desafioSpring.controller;

import com.eliseu.desafioSpring.domain.Disciplina;
import com.eliseu.desafioSpring.exception.DisciplinaException;
import com.eliseu.desafioSpring.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public ResponseEntity<List<Disciplina>> buscarDisciplina(){
        return ResponseEntity.ok(disciplinaService.buscarDisciplina());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Disciplina>> buscarDisciplinaPorId(@PathVariable Long id){
        Optional<Disciplina> disciplina = disciplinaService.buscarDisciplinaPorId(id);
        return ResponseEntity.ok().body(disciplina);
    }

    @PostMapping
    public ResponseEntity<Disciplina> adicionarDisciplina(@RequestBody Disciplina disciplina) throws DisciplinaException {
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaService.adicionarDisciplina(disciplina));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> editarDisciplina(@PathVariable Long id, @RequestBody Disciplina disciplina){
        return ResponseEntity.ok(disciplinaService.editarDisciplina(id, disciplina));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Disciplina> deletarDisciplina(@PathVariable Long id){
        disciplinaService.deletarDisciplina(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/ultimaHora")
    public ResponseEntity<List<Disciplina>> buscarDisciplinaCriadasUltimaHora(){
        return ResponseEntity.ok(disciplinaService.buscarDisciplinaCriadasUltimaHora());
    }

}
