package main.java.padroesCriacao.factoryMethod;

public class LogisticaAerea implements ILogistica{

    @Override
    public String buscarPacote() {
        return "Busca pacote por vias aéreas";
    }

    @Override
    public String entregar() {
        return "Entrega pacote por vias aéreas";
    }
    
}
