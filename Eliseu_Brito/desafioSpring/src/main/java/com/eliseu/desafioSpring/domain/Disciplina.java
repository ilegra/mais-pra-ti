package com.eliseu.desafioSpring.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;
    private Date iniciaEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Date getIniciaEm() {
        return iniciaEm;
    }

    public void setIniciaEm(Date iniciaEm) {
        this.iniciaEm = iniciaEm;
    }
}
