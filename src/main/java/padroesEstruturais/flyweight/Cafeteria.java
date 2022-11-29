package main.java.padroesEstruturais.flyweight;

import java.util.ArrayList;

public class Cafeteria {
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();

    public void fazerPedido(CafeSabores nomeSabor, CafeLatteArte latteArte, int numeroMesa) {
        pedidos.add(Pedido.of(nomeSabor, latteArte, numeroMesa));
    }

    public int getNumeroDePedidos() {
        return pedidos.size();
    }
}
