package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.Tarefa;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GerenciamentoTarefasTest {

    GerenciamentoTarefas gerenciamentoTarefas;
    HashMap<Integer, Tarefa> listaTarefas;

    @BeforeEach
    public void configuracao() {
        gerenciamentoTarefas = new GerenciamentoTarefas();
        listaTarefas = new HashMap<>();
    }

    @Test
    public void testCriarTarefa_comId() {

        Integer idTarefaEsperada = 1;

        Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");

        assertEquals(idTarefaEsperada, idTarefaResultado);
    }

    @Test
    public void testCriarTarefa_comId_validacaoPorTarefa() {

        Integer idTarefaEsperada = 1;
        Tarefa tarefaEsperada = new Tarefa("Titulo", "Descricao");

        Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");
        Tarefa tarefaResultado = gerenciamentoTarefas.obterTarefa(listaTarefas, idTarefaResultado);

        assertEquals(idTarefaEsperada, idTarefaResultado);

        Assertions.assertThat(tarefaEsperada).isEqualToComparingFieldByField(tarefaResultado);
    }

    @Test
    public void testObterTarefa() {
        Tarefa tarefa = new Tarefa("Titulo1", "Descricao1");
        listaTarefas.put(1, tarefa);

        Tarefa result = gerenciamentoTarefas.obterTarefa(listaTarefas, 1);

        assertEquals(listaTarefas.get(1), result);
    }

    @Test
    public void testEditarTarefa() {
        Tarefa tarefa = new Tarefa("Titulo1", "Descricao1");
        listaTarefas.put(1, tarefa);

        Boolean result = gerenciamentoTarefas.editarTarefa(listaTarefas, 1, "Titulo Alterado", "Descricao Alterada");

        assertTrue(result);
    }

    @Test
    public void testExcluirTarefa() {
        Tarefa tarefa = new Tarefa("Titulo1", "Descricao1");
        listaTarefas.put(1, tarefa);

        Boolean result = gerenciamentoTarefas.excluirTarefa(listaTarefas, 1);

        assertTrue(result);
    }

    @Test
    public void testExcluirTarefaQuandoTarefaNaoExistente() {

        Boolean result = gerenciamentoTarefas.excluirTarefa(listaTarefas, 1);

        assertFalse(result);
    }

}