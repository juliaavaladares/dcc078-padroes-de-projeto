package test.java.padroesCriacao.abstractFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.padroesCriacao.abstractFactory.*;

public class ComputadorTest {
    @Test
    public void deveCriarLaptop() {
        Computador laptop = ComputadorFactory.criaComputador(new LaptopFactory());
        
        assertNotNull(laptop);
    }
    @Test
    public void deveCriarServidor() {
        Computador servidor = ComputadorFactory.criaComputador(new ServidorFactory("2 GB","500 GB","2.4 GHz"));
        
        assertNotNull(servidor);
        assertEquals("2 GB", servidor.getRAM());
    }
    @Test
    public void deveCriarPC() {
        Computador pc = ComputadorFactory.criaComputador(new PCFactory("2 GB","500 GB","2.4 GHz"));
        
        assertNotNull(pc);
        assertEquals("2 GB", pc.getRAM());
    }
}
