package main.java.padroesCriacao.singleton;

public class Capitao {

    private Capitao() {};
    private static Capitao instance = new Capitao();
    public static Capitao getInstance() {
        return instance;
    }

    private String nomeCapitao;
    private String nomeTime;
    
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNomeCapitao() {
        return nomeCapitao;
    }

    public void setNomeCapitao(String nomeCapitao) {
        this.nomeCapitao = nomeCapitao;
    }
   
}