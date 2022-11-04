package main.java.padroesEstruturais.bridge;


public abstract class Time{
    protected String nomeTime;
    protected int numeroAtacantes;
    protected int numeroZagueiros;
    protected Jogador jogador;
    
    public Time(String nomeTime, int numeroAtacantes, int numeroZagueiros) {
        this.nomeTime = nomeTime;
        this.numeroAtacantes = numeroAtacantes;
        this.numeroZagueiros = numeroZagueiros;
    }
    
    public int getNumeroAtacantes() {
        return numeroAtacantes;
    }

    public void setNumeroAtacantes(int numeroAtacantes) {
        this.numeroAtacantes = numeroAtacantes;
    }

    public int getNumeroZagueiros() {
        return numeroZagueiros;
    }

    public void setNumeroZagueiros(int numeroZagueiros) {
        this.numeroZagueiros = numeroZagueiros;
    }

    public String getNomeTime() {
        return nomeTime;
    }
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public abstract float calculaScoreTime(Jogador atacante, Jogador zagueiro);
}
