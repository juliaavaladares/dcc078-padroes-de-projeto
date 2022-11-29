package main.java.padroesEstruturais.facade;

public class Iphone implements LojaMobile{
    private String modeloIphone;
    private float preco;
    
    public Iphone(String modeloIphone, float preco) {
        this.modeloIphone = modeloIphone;
        this.preco = preco;
    }

    @Override
    public String modelo() {
        return this.modeloIphone;       
    }

    @Override
    public float preco() {
        return this.preco;
    }
    
}
