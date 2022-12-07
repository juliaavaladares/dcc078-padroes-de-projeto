package test.java.padresEstruturais.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.padroesEstruturais.adapter.Trabalhador;

public class TrabalhadorTest {
    @Test
    public void deveRetornarSalarioTrabalhadorCLT() {
        Trabalhador trabalhador = new Trabalhador();

        trabalhador.setRegimeTrabalho("CLT");
        trabalhador.setSalario((float) 1900.30);

        assertEquals("CLT", trabalhador.getRegimeDeTrabalho());
    }


    @Test
    public void deveRetornarSalarioTrabalhadorCNPJ() {
        Trabalhador trabalhador = new Trabalhador();

        trabalhador.setRegimeTrabalho("CNPJ");
        trabalhador.setSalario((float) 1900.30);

        assertEquals("CNPJ", trabalhador.getRegimeDeTrabalho());
    }
}
