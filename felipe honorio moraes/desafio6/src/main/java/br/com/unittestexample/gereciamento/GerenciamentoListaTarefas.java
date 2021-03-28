package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.ListaTarefas;
import br.com.unittestexample.dominio.Tarefa;

import java.util.HashMap;

public class GerenciamentoListaTarefas {

    GerenciamentoTarefas gerenciamentoTarefas = new GerenciamentoTarefas();

    public Integer criarTarefaDiaSemana(ListaTarefas listaTarefas, Integer id, String titulo, String descricao){

        HashMap<Integer, Tarefa> listaTarefasDiaSemana;
        if(validarSeListaDiaSemanaNula(listaTarefas)){
            listaTarefasDiaSemana = new HashMap<>();
        } else {
            listaTarefasDiaSemana = listaTarefas.getListaTarefasDiaSemana();
        }

        Integer resultado = gerenciamentoTarefas.criarTarefa(listaTarefasDiaSemana, id, titulo, descricao);

        return resultado;
    }

    private boolean validarSeListaDiaSemanaNula(ListaTarefas listaTarefas){
        return listaTarefas.getListaTarefasDiaSemana() == null;
    }

    public Tarefa obterTarefaDiaSemana(ListaTarefas listaTarefas, Integer id){
        if(!listaTarefas.getListaTarefasDiaSemana().containsKey(id)){
            return null;
        }
        return listaTarefas.getListaTarefasDiaSemana().get(id);

    }

    public boolean editarTarefaDiaSemana(ListaTarefas listaTarefas, Integer id, String titulo, String descricao){

        if(!listaTarefas.getListaTarefasDiaSemana().containsKey(id)){
            return false;
        }

        Tarefa tarefa = listaTarefas.getListaTarefasDiaSemana().get(id);

        if(titulo == null && descricao == null){
            return false;
        }

        tarefa.setTitulo(titulo != null ? titulo : null);
        tarefa.setDescricao(descricao != null ? descricao : null);

        return true;
    }

    public boolean excluirTarefaDiaSemana(ListaTarefas listaTarefas, Integer id){

        if(!listaTarefas.getListaTarefasDiaSemana().containsKey(id)){
            return false;
        }

        listaTarefas.getListaTarefasDiaSemana().remove(id);

        return  true;
    }

}
