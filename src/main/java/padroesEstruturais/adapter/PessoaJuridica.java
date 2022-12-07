package main.java.padroesEstruturais.adapter;

public class PessoaJuridica implements IRegimeTrabalho{

    private String regimeTrabalho;
    private float salario;
    
    @Override
    public String getRegimeDeTrabalho() {
        return this.regimeTrabalho;
    }

    @Override
    public void setRegimeTrabalho(String regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    @Override
    public float getSalario() {
        return this.salario;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

}