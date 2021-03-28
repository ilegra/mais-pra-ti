package br.com.unittestexample.gereciamento;

import br.com.unittestexample.dominio.Tarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.assertj.core.api.Assertions;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
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
        //Assertions.assertThat(tarefaEsperada).isEqualToComparingFieldByField(tarefaResultado);
    }

    @Test
    public void testObterTarefa(){
        //TODO desenvolver teste unitário do método obterTarefa()

    }

    @Test
    public void testEditarTarefa(){
        //TODO desenvolver teste unitário do método editarTarefa()
        //TODO corrigir lógica com erro no método editarTarefa()
    }

    @Test
    public void testExcluirTarefa(){
        //TODO desenvolver teste unitário do método excluirTarefa()
        //TODO corrigir lógica com erro no método excluirTarefa()
    }

}