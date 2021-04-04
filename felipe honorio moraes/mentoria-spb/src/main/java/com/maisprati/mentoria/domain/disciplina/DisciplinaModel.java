package com.maisprati.mentoria.domain.disciplina;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Disciplina")
public class DisciplinaModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
       private String nome;
       private String descricao;
       private LocalDateTime data;
       private  Date IniciaEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }
        public String getDescricao() { return descricao; }
        public void setDescricao(String descricao) { this.descricao = descricao; }
        public LocalDateTime getData() { return data; }

        public void setData(Date data) { this.data = LocalDateTime.now(); }

        public Date getIniciaEm() { return IniciaEm; }
        public void setIniciaEm(Date iniciaEm) { IniciaEm = iniciaEm; }
}

