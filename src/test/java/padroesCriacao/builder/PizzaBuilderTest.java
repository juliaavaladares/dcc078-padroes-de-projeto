package test.java.padroesCriacao.builder;

import org.junit.Test;

import main.java.padroesCriacao.builder.*;
import static org.junit.Assert.*;


public class PizzaBuilderTest {
    
    @Test
    public void deveRetornarExcecaoParaPizzaSemTamanho() {
        try {
            PizzaBuilder PizzaBuilder = new PizzaBuilder();
            Pizza Pizza = PizzaBuilder
                    .setTamanho(0)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pizza sem tamanho", e.getMessage());
        }
    }

    @Test
    public void deveRetornarPizzaValido() {
        PizzaBuilder PizzaBuilder = new PizzaBuilder();
        Pizza Pizza = PizzaBuilder
                .setTamanho(30)
                .setQueijo(true)
                .setBacon(true)
                .setBorda(true)
                .setSaborBorda("Quatro queijos")
                .build();

        assertNotNull(Pizza);
    }
}
