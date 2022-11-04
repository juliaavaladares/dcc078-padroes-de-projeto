package test.java.padroesCriacao.factoryMethod;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.padroesCriacao.factoryMethod.*;

public class LogisticaAereaTest {
    @Test
    public void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Aerea");
        assertEquals("Busca pacote por vias aéreas", logistica.buscarPacote());
    }

    @Test
    public void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Aerea");
        assertEquals("Entrega pacote por vias aéreas", logistica.entregar());
    }
}
