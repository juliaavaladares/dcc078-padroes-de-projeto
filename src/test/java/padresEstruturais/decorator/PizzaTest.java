package test.java.padresEstruturais.decorator;

import main.java.padroesEstruturais.decorator.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class PizzaTest {

    @Test
    void deveRetornarPrecoPizzaRecheioPadrao(){
        
        Pizza pizza = new Recheio("PEQUENA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizza.getPrecoPizza(),0);
    }

    @Test
    void deveRetornarPrecoPizzaRecheioFrangoPequena(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "PEQUENA", false);

        float precoEsperado = (float) 35.99;

        assertEquals(precoEsperado, pizzaFrango.getPrecoPizza(), 0);
    }

    @Test
    void deveRetornarPrecoPizzaRecheioFrangoMedia(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "MEDIA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizzaFrango.getPrecoPizza(), 0);
    }
    
}
