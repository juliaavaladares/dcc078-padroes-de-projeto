package main.java.padroesEstruturais.bridge;

public class Zagueiro implements Jogador {
    private int numDefesas;
    private int numPartidas;
    
    public Zagueiro(int numDefesas, int numPartidas) {
        this.numDefesas = numDefesas;
        this.numPartidas = numPartidas;
    }

    @Override
    public float indicaPontuacaoJogador() {
        return (float) (1.3*(numDefesas/numPartidas));
    }
    
}
