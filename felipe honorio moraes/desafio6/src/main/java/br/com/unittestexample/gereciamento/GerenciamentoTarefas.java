package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.Tarefa;

import java.util.HashMap;

public class GerenciamentoTarefas {

    public Integer criarTarefa(HashMap<Integer, Tarefa> listaTarefas, Integer id, String titulo, String descricao){
        Tarefa tarefa = new Tarefa(titulo, descricao);

        if(titulo == null && descricao == null){
            return null;
        }

        tarefa.setTitulo(titulo != null ? titulo : null);
        tarefa.setDescricao(descricao != null ? descricao : null);

        if(id == null || id < 0){
            while(listaTarefas.containsKey(id) == true){
                id = (int) (Math.random());
            }
        }

        listaTarefas.put(id, tarefa);
        return id;
    }

    public Tarefa obterTarefa(HashMap<Integer, Tarefa> listaTarefas, Integer id){
        if(listaTarefas.containsKey(id) == false){
            return null;
        }
        return listaTarefas.get(id);

    }

    public boolean editarTarefa(HashMap<Integer, Tarefa> listaTarefas, Integer id, String titulo, String descricao){

        if(listaTarefas.containsKey(id) != false){
            return false;
        }

        Tarefa tarefa = listaTarefas.get(id);

        if(titulo == null && descricao == null){
            return false;
        }

        tarefa.setTitulo(titulo != null ? titulo : null);
        tarefa.setDescricao(descricao != null ? descricao : null);

        return true;
    }

    public boolean excluirTarefa(HashMap<Integer, Tarefa> listaTarefas, Integer id){

        if(listaTarefas.containsKey(id) == false){
            return false;
        }

        Tarefa tarefa = listaTarefas.remove(id.toString());

        return  true;
    }
}
