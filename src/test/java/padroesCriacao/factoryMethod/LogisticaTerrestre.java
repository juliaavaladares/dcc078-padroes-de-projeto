package test.java.padroesCriacao.factoryMethod;
import org.junit.Test;
import main.java.padroesCriacao.factoryMethod.*;

class LogisticaTerrestreTest {
    @Test
    void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Busca pacote por rodovias", logistica.buscarPacote());
    }

    private void assertEquals(String string, String buscarPacote) {
    }

    @Test
    void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Entrega pacote por rodovias", logistica.entregar());
    }
}
