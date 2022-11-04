package main.java.padroesEstruturais.bridge;


public class Cruzeiro extends Time {
    public Cruzeiro(String nomeTime, int numeroAtacantes, int numeroZagueiros) {
        super(nomeTime, numeroAtacantes, numeroZagueiros);
    }

    @Override
    public float calculaScoreTime(Jogador atacante, Jogador zagueiro) {

        float pontuacaoAtacantes = this.numeroAtacantes * atacante.indicaPontuacaoJogador();
        float pontuacaoZagueiros = this.numeroZagueiros * zagueiro.indicaPontuacaoJogador();

        return pontuacaoAtacantes + pontuacaoZagueiros ;
    }
    
}