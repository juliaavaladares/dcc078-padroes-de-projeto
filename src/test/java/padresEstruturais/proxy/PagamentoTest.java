package test.java.padresEstruturais.proxy;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;


import org.junit.Test;

import main.java.padroesEstruturais.proxy.*;

public class PagamentoTest {
    @Test
    public void deveConsultarLimite(){
        ContaBancaria conta1 = new ContaBancaria("Itau", "1111", "123456", 1000, "123456");
        CartaoDeDebitoProxy cartaoDeDebito = new CartaoDeDebitoProxy(conta1);

        float limiteEsperado = 1000;

        assertEquals(limiteEsperado, cartaoDeDebito.consultaLimite(), 0);

    }

    @Test
    public void deveRealizarPagamentoComSucesso(){
        ContaBancaria conta1 = new ContaBancaria("Itau", "1111", "123456", 1000, "123456");
        CartaoDeDebitoProxy cartaoDeDebito = new CartaoDeDebitoProxy(conta1);

        String mensagemPagemnto = cartaoDeDebito.pagaProduto(700, "123456");

        assertEquals("Produto pago com sucesso", mensagemPagemnto);
        assertEquals(300, cartaoDeDebito.consultaLimite(), 0);

    }

    @Test
    public void naoDeveRealizarPagamentoSaldoInsuficiente(){
        ContaBancaria conta1 = new ContaBancaria("Itau", "1111", "123456", 1000, "123456");
        CartaoDeDebitoProxy cartaoDeDebito = new CartaoDeDebitoProxy(conta1);

        String mensagemPagemnto = cartaoDeDebito.pagaProduto(3000, "123456");

        assertEquals("Saldo insuficiente para pagar produto", mensagemPagemnto);
    }

    @Test
    public void naoDeveRealizarPagamentoSenhaIncorreta(){
        try {
            ContaBancaria conta1 = new ContaBancaria("Itau", "1111", "123456", 1000, "123456");
            CartaoDeDebitoProxy cartaoDeDebito = new CartaoDeDebitoProxy(conta1);

            cartaoDeDebito.pagaProduto(3000, "3456");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Senha Incorreta", e.getMessage());
        }

    }
}
