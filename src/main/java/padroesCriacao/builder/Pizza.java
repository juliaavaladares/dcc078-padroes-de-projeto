package main.java.padroesCriacao.builder;

public class Pizza {
    private int tamanho;
	private boolean queijo;
	private boolean tomate;
	private boolean bacon;
    private boolean borda;
    private String saborBorda;
    
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isQueijo() {
        return queijo;
    }
    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }
    public boolean isTomate() {
        return tomate;
    }
    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public boolean isBacon() {
        return bacon;
    }
    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }
    public boolean isBorda() {
        return borda;
    }
    public void setBorda(boolean borda) {
        this.borda = borda;
    }
    public String getSaborBorda() {
        return saborBorda;
    }
    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }
    
}
