package main.java.padroesEstruturais.facade;

public class Samsung implements LojaMobile{
    private String modeloSamsung;
    private float preco;

    public Samsung(String modeloSamsung, float preco) {
        this.modeloSamsung = modeloSamsung;
        this.preco = preco;
    }

    @Override
    public String modelo() {
        return this.modeloSamsung;
    }

    @Override
    public float preco() {
        return this.preco;
    }
    
}
