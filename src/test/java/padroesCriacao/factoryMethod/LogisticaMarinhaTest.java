package test.java.padroesCriacao.factoryMethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.padroesCriacao.factoryMethod.*;

public class LogisticaMarinhaTest {
    @Test
    public void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Marinha");
        assertEquals("Busca pacote por vias marinhas", logistica.buscarPacote());
    }

    @Test
    public void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Marinha");
        assertEquals("Entrega pacote por vias marinhas", logistica.entregar());
    }
}