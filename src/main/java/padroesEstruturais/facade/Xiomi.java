package main.java.padroesEstruturais.facade;

public class Xiomi implements LojaMobile{
    private String modeloXiomi;
    private float preco;

    public Xiomi(String modeloXiomi, float preco) {
        this.modeloXiomi = modeloXiomi;
        this.preco = preco;
    }

    @Override
    public String modelo() {
        return this.modeloXiomi;
    }

    @Override
    public float preco() {
        return this.preco;
    }
}
