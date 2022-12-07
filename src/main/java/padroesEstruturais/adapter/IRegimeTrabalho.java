package main.java.padroesEstruturais.adapter;

public interface IRegimeTrabalho {
    String getRegimeDeTrabalho();
    float getSalario();
    void setSalario(float salario);
    void setRegimeTrabalho(String regimeTrabalho);
}
