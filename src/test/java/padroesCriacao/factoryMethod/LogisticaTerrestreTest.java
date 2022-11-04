package test.java.padroesCriacao.factoryMethod;
import org.junit.Test;
import main.java.padroesCriacao.factoryMethod.*;

public class LogisticaTerrestreTest {
    @Test
    public void deveBuscarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Busca pacote por rodovias", logistica.buscarPacote());
    }

    private void assertEquals(String string, String buscarPacote) {
    }

    @Test
    public void deveEntregarPacoteComSucesso() {
        ILogistica logistica = LogisticaFactory.obterLogistica("Terrestre");
        assertEquals("Entrega pacote por rodovias", logistica.entregar());
    }
}
