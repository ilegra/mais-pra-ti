package com.maisprati.desafiospring.service.disciplina;

import com.maisprati.desafiospring.domain.disciplina.DisciplinaModel;
import com.maisprati.desafiospring.domain.disciplina.DisciplinaRepository;
import com.maisprati.desafiospring.exception.BadRequestException;
import com.maisprati.desafiospring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private DateUtil dateUtil;

    public List<DisciplinaModel> findAll() {
        return disciplinaRepository.findAll();
    }

    public Optional<DisciplinaModel> findById(Long id) throws BadRequestException {
        verifyIfExists("buscar", "Disciplina", id);
        return disciplinaRepository.findById(id);
    }

    public DisciplinaModel createDisciplina(DisciplinaModel disciplinaModel) {
        disciplinaModel.setCriadoEm(dateUtil.formatter(LocalDateTime.now()));
        return disciplinaRepository.save(disciplinaModel);
    }

    public void deleteById(Long id) throws BadRequestException {
        verifyIfExists("apagar", "Disciplina", id);
        disciplinaRepository.deleteById(id);
    }

    public DisciplinaModel updateDisciplina(Long id, DisciplinaModel disciplinaInformada) throws BadRequestException {
        DisciplinaModel disciplinaAtualizada = verifyIfExists("atualizar", "Disciplina", id);
        disciplinaAtualizada.setNome(disciplinaInformada.getNome());
        disciplinaAtualizada.setDescricao(disciplinaInformada.getDescricao());
        disciplinaAtualizada.setIniciaEm(disciplinaInformada.getIniciaEm());

        return disciplinaRepository.save(disciplinaAtualizada);
    }

    public List<DisciplinaModel> findByLastHour() {
        return disciplinaRepository.findByLastHour();
    }

    public DisciplinaModel verifyIfExists(String action, String typeObject, Long id) throws BadRequestException {
        return disciplinaRepository.findById(id)
                .orElseThrow(() -> new BadRequestException(action, typeObject, id));
    }
}

