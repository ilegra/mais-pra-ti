package br.com.unittestexample.dominio;

import java.util.HashMap;

public class ListaTarefas extends Tarefa {

    HashMap<Integer, Tarefa> listaTarefasDiaSemana;
    HashMap<Integer, Tarefa> listaTarefasFinalSemana;

    public ListaTarefas() {
    }

    public ListaTarefas(HashMap<Integer, Tarefa> listaTarefasDiaSemana, HashMap<Integer, Tarefa> listaTarefasFinalSemana) {
        this.listaTarefasDiaSemana = listaTarefasDiaSemana;
        this.listaTarefasFinalSemana = listaTarefasFinalSemana;
    }

    public HashMap<Integer, Tarefa> getListaTarefasDiaSemana() {
        return listaTarefasDiaSemana;
    }

    public void setListaTarefasDiaSemana(HashMap<Integer, Tarefa> listaTarefasDiaSemana) {
        this.listaTarefasDiaSemana = listaTarefasDiaSemana;
    }

    public HashMap<Integer, Tarefa> getListaTarefasFinalSemana() {
        return listaTarefasFinalSemana;
    }

    public void setListaTarefasFinalSemana(HashMap<Integer, Tarefa> listaTarefasFinalSemana) {
        this.listaTarefasFinalSemana = listaTarefasFinalSemana;
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "listaTarefasDiaSemana=" + listaTarefasDiaSemana +
                ", listaTarefasFinalSemana=" + listaTarefasFinalSemana +
                '}';
    }
}
