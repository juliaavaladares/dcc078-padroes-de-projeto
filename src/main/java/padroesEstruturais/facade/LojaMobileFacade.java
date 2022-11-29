package main.java.padroesEstruturais.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LojaMobileFacade {

    public static float buscaMobileComMelhorPreco(){
        List<Float> precosMobiles = new ArrayList<Float>();

        LojaMobile iphone = new Iphone("IPhone 13", 3000);
        LojaMobile samsung = new Samsung("Galaxy S22", 3500);
        LojaMobile xiomi = new Xiomi("Redmi 11", 1500);

        precosMobiles.add(iphone.preco());
        precosMobiles.add(samsung.preco());
        precosMobiles.add(xiomi.preco());

        Collections.sort(precosMobiles);

        return precosMobiles.get(0);
    }
    
}
