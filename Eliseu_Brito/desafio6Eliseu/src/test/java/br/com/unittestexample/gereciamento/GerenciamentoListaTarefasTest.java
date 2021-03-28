package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.ListaTarefas;
import br.com.unittestexample.dominio.Tarefa;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GerenciamentoListaTarefasTest {

    GerenciamentoListaTarefas gerenciamentoListaTarefas;
    ListaTarefas listaTarefas;

    @Test
    public void testCriarTarefaDiaSemana_comId(){

        Integer idTarefaEsperada = 1;

        GerenciamentoTarefas gerenciamentoTarefasMock = mock(GerenciamentoTarefas.class);
        when(gerenciamentoTarefasMock.criarTarefa(any(), any(), any(), any())).thenReturn(1);

        listaTarefas = new ListaTarefas();
        listaTarefas.setListaTarefasDiaSemana(new HashMap<Integer, Tarefa>());
        listaTarefas.setListaTarefasFinalSemana(new HashMap<Integer, Tarefa>());
        gerenciamentoListaTarefas = new GerenciamentoListaTarefas();
        Integer idTarefaResultado = gerenciamentoListaTarefas.criarTarefaDiaSemana(listaTarefas, 1, "Titulo", "Descricao");

        assertEquals(idTarefaEsperada, idTarefaResultado);
    }

}