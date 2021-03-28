package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.Tarefa;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class GerenciamentoTarefasTest {

    GerenciamentoTarefas gerenciamentoTarefas;
    HashMap<Integer, Tarefa> listaTarefas;

    @BeforeEach
    public void configuracao() {
        gerenciamentoTarefas = new GerenciamentoTarefas();
        listaTarefas = new HashMap<>();
    }

    @Test
    public void testCriarTarefa_comId(){

        Integer idTarefaEsperada = 1;

        Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");

        assertEquals(idTarefaEsperada, idTarefaResultado);
    }

    @Test
    public void testCriarTarefa_comId_validacaoPorTarefa(){

        Integer idTarefaEsperada = 1;
        Tarefa tarefaEsperada = new Tarefa("Titulo", "Descricao");

        Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");
        Tarefa tarefaResultado = gerenciamentoTarefas.obterTarefa(listaTarefas, idTarefaResultado);

        assertEquals(idTarefaEsperada, idTarefaResultado);

        Assertions.assertThat(tarefaEsperada).isEqualToComparingFieldByField(tarefaResultado);
    }

    @Test
    public void testObterTarefa(){
        listaTarefas.put(1, new Tarefa("Estudar", "Spring Boot"));

        Tarefa tarefaResultado = gerenciamentoTarefas.obterTarefa(listaTarefas, 1);

        assertEquals(listaTarefas.get(1), tarefaResultado);
    }

    @Test
    public void testEditarTarefa(){
        listaTarefas.put(1, new Tarefa("Título", "Descrição"));

        boolean tarefaResultado = gerenciamentoTarefas.editarTarefa(listaTarefas, 1, "Título Editado", "Descrição Editada");

        assertTrue(tarefaResultado);
    }

    @Test
    public void testExcluirTarefa(){
        listaTarefas.put(1, new Tarefa("coisa","tal"));

        boolean tarefaResultado = gerenciamentoTarefas.excluirTarefa(listaTarefas, 1);

        assertTrue(tarefaResultado);
    }

}