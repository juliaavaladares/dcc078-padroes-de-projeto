package main.java.padroesCriacao.factoryMethod;

public class LogisticaTerrestre implements ILogistica{

    @Override
    public String buscarPacote() {
        return "Busca pacote por rodovias";
    }

    @Override
    public String entregar() {
        return "Entrega pacote por rodovias";
    }
    
}
