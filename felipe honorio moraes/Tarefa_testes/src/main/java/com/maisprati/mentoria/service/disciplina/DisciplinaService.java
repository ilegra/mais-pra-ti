package com.maisprati.mentoria.service.disciplina;

import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.domain.disciplina.DisciplinaRepository;
import com.maisprati.mentoria.exception.MentoriaException;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    private DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) { this.disciplinaRepository = disciplinaRepository; }

    public Optional<DisciplinaModel> obter(Long id) {
        return this.disciplinaRepository
                .findById(id);
    }

    public DisciplinaModel incluir(DisciplinaModel disciplinaInformada) {
        if (disciplinaInformada.getId() != null) {
            throw new MentoriaException("Aluno", "incluir", disciplinaInformada.getId());
        }
        return this.disciplinaRepository
                .save(disciplinaInformada);
    }

    @Autowired
    public DisciplinaModel atualizar(Long id, DisciplinaModel disciplinaInformada) {
        DisciplinaModel disciplinaAtualizada = obter(id)
                .orElseThrow(() -> new MentoriaException("Disciplina",
                        "atualizar",
                        id));
        disciplinaAtualizada.setNome(disciplinaInformada.getNome());
        return this.disciplinaRepository.save(disciplinaAtualizada);
    }

    


}
