package test.java.padroesCriacao.singleton;

import org.junit.Test;

import main.java.padroesCriacao.singleton.Capitao;
import static org.junit.Assert.*;


public class CapitaoTest {
    @Test
    public void deveRetornarNomeCapitao() {
        Capitao.getInstance().setNomeCapitao("Júlia");
        assertEquals("Júlia", Capitao.getInstance().getNomeCapitao());
    }

    @Test
    public void deveRetornarnNomeTime() {
        Capitao.getInstance().setNomeTime("Cruzeiro");
        assertEquals("Cruzeiro", Capitao.getInstance().getNomeTime());
    }
}
