package main.java.padroesEstruturais.flyweight;

public class Cafe {
    private CafeSabores nomeDoSabor;

    public Cafe(CafeSabores nomeDoSabor) {
        super();
        this.nomeDoSabor = nomeDoSabor;
    }

    public CafeSabores getnomeDoSabor() {
        return nomeDoSabor;
    }

    public CafeLatteArte applyLatteArte(CafeLatteArte latteArte) {
        return latteArte;
    }
}