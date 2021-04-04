package com.maisprati.mentoria.service.disciplina;

import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.domain.disciplina.DisciplinaRepository;
import com.maisprati.mentoria.exception.MentoriaException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;
    private Object data;

    public DisciplinaService(DisciplinaRepository disciplinaRepository)
    { this.disciplinaRepository = disciplinaRepository; }

    public Optional<DisciplinaModel> obter(Long id) {
        return this.disciplinaRepository
                .findById(id);
    }

    public DisciplinaModel incluir(DisciplinaModel disciplinaInformada) {
        if(disciplinaInformada.getId() != null){
            throw new MentoriaException("Disciplina", "incluir");
        }
        return this.disciplinaRepository
                .save(disciplinaInformada);
    }

    public DisciplinaModel atualizar(Long id, DisciplinaModel disciplinaInformada) {
        DisciplinaModel disciplinaAtualizada = obter(id).orElseThrow(() -> new MentoriaException("Disciplinaa", "atualizar", id));
        disciplinaAtualizada.setNome(disciplinaInformada.getNome());
        return this.disciplinaRepository.save(disciplinaAtualizada);
    }

    public void excluir(Long id) {
        this.disciplinaRepository.deleteById(id);
    }

    public List<DisciplinaModel> obterPorNome(String nome) {
        return this.disciplinaRepository
                .findAllByNomeContaining(nome);
    }



}
