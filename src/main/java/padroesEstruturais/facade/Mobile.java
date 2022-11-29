package main.java.padroesEstruturais.facade;

public class Mobile {

    public float melhorPreco(){
        return LojaMobileFacade.buscaMobileComMelhorPreco();
    }
    
}
