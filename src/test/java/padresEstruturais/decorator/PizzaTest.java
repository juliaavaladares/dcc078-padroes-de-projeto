package test.java.padresEstruturais.decorator;

import main.java.padroesEstruturais.decorator.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PizzaTest {

    @Test
    public void deveRetornarPrecoPizzaRecheioPadrao(){
        
        Pizza pizza = new Recheio("PEQUENA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizza.getPrecoPizza(),0);
    }

    @Test
   public void deveRetornarPrecoPizzaRecheioFrangoPequena(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "PEQUENA", false);

        float precoEsperado = (float) 35.99;
        float precoRecebido = (float) pizzaFrango.getPrecoPizza();

        assertEquals(precoEsperado, precoRecebido, 0);
    }

    @Test
    public void deveRetornarPrecoPizzaRecheioFrangoMedia(){
        Recheio recheio = new Recheio();
        Pizza pizzaFrango = new FrangoComCatupiry(recheio, "MEDIA", false);

        float precoEsperado = (float) 55.99;

        assertEquals(precoEsperado, pizzaFrango.getPrecoPizza(), 0);
    }
    
}
