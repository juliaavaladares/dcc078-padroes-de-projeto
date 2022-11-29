package main.java.padroesEstruturais.flyweight;

public class Pedido {
    protected Cafe Cafe;

    public Pedido(Cafe Cafe) {
        super();
        this.Cafe = Cafe;
    }

    public static Pedido of(CafeSabores nomeSabor, CafeLatteArte latteArte, int tableNumber) {
        Cafe Cafe = CafeFactory.fazerCafe(nomeSabor, latteArte);
        return new Pedido(Cafe);
    }

    public Cafe getCafe() {
        return Cafe;
    }

}