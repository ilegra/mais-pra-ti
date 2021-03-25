package com.eliseu.desafioSpring.service;

import com.eliseu.desafioSpring.domain.Disciplina;
import com.eliseu.desafioSpring.exception.DisciplinaException;
import com.eliseu.desafioSpring.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java.lang.System.currentTimeMillis;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public List<Disciplina> buscarDisciplina() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> buscarDisciplinaPorId(Long id) {
        return disciplinaRepository.findById(id);
    }

    public Disciplina adicionarDisciplina(Disciplina disciplina) throws DisciplinaException {
        disciplina.setCriadoEm(new Date(currentTimeMillis()));
        if (disciplina.getId() != null) {
            throw new DisciplinaException("Disciplina", "adicionarDisciplina");
        }
        return disciplinaRepository.save(disciplina);
    }

    public Disciplina editarDisciplina(Long id, Disciplina disciplinaEditado) {
        Disciplina disciplinaAtualizada = buscarDisciplinaPorId(id).orElseThrow(() -> new DisciplinaException("Disciplina", "editarDisciplina", id));
        disciplinaAtualizada.setNome(disciplinaEditado.getNome());
        disciplinaAtualizada.setDescricao(disciplinaEditado.getDescricao());
        return disciplinaRepository.save(disciplinaAtualizada);
    }

    public void deletarDisciplina(Long id) {
        disciplinaRepository.deleteById(id);
    }

    public List<Disciplina> buscarDisciplinaCriadasUltimaHora() {
        Date creationDateTime = new Date(currentTimeMillis() - 3600000);
        return disciplinaRepository.findAllCriadosUltimaHora(creationDateTime);
    }

}
