package main.java.padroesCriacao.factoryMethod;

public class LogisticaMarinha implements ILogistica{

    @Override
    public String buscarPacote() {
        return "Busca pacote por vias marinhas";
    }

    @Override
    public String entregar() {
        return "Entrega pacote por vias marinhas";
    }
    
}
