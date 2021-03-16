package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.Tarefa;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import org.assertj.core.api.Assertions;

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

        //TODO configurar dependência biblioteca assertj
        Assertions.assertThat(tarefaEsperada).isEqualToComparingFieldByField(tarefaResultado);
    }
    @Test
    public void testObterTarefa(){
        Integer idTarefa = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");
        System.out.println(listaTarefas);
        System.out.println(idTarefa);
        Tarefa tarefaRetornada = gerenciamentoTarefas.obterTarefa(listaTarefas,1);

        assertNotNull(tarefaRetornada);

        //TODO desenvolver teste unitário do método obterTarefa()

    }

    @Test
    public void testEditarTarefa(){

        Integer idTarefaEsperada = 1;
        Tarefa tarefaEsperada = new Tarefa("TituloMudado", "DescricaoMudado");

        Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");
        gerenciamentoTarefas.editarTarefa(listaTarefas, 1, "TituloMudado", "DescricaoMudado");
        Tarefa tarefaResultado = gerenciamentoTarefas.obterTarefa(listaTarefas, idTarefaResultado);
              assertEquals(idTarefaEsperada, idTarefaResultado);

        //TODO desenvolver teste unitário do método editarTarefa()
        //TODO corrigir lógica com erro no método editarTarefa()
    }

    @Test
    public void testExcluirTarefa(){
      Integer idTarefaResultado = gerenciamentoTarefas.criarTarefa(listaTarefas, 1, "Titulo", "Descricao");

        Boolean exclusao = gerenciamentoTarefas.excluirTarefa(listaTarefas, 1);

        assertTrue(exclusao);
        //TODO desenvolver teste unitário do método excluirTarefa()
        //TODO corrigir lógica com erro no método excluirTarefa()

    }

}