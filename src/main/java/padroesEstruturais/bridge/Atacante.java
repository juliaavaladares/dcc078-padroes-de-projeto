package main.java.padroesEstruturais.bridge;

public class Atacante implements Jogador {
    private int numGols;
    private int numPartidas;

    public Atacante(int numGols, int numPartidas) {
        this.numGols = numGols;
        this.numPartidas = numPartidas;
    }

    @Override
    public float indicaPontuacaoJogador() {
        return numGols/numPartidas;
    }
    
}