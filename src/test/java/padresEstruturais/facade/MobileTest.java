package test.java.padresEstruturais.facade;

import main.java.padroesEstruturais.facade.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MobileTest {

    @Test
    void deveRetornarMobileComMelhorPreco() {
        Mobile mobile = new Mobile();

        float melhorPrecoMobile = mobile.melhorPreco();
        
        assertEquals(1500, melhorPrecoMobile, 0);
    }
    
}
