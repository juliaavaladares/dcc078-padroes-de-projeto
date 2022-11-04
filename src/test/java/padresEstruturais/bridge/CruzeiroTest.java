package test.java.padresEstruturais.bridge;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.padroesEstruturais.bridge.*;

public class CruzeiroTest {

    @Test
    public void deveRetornarPontuacaoCruzeiro(){
        Jogador atacante = new Atacante(5, 9);
        Jogador zagueiro = new Zagueiro(10, 3);

        Cruzeiro cruzeiro = new Cruzeiro("Cruzeiro", 3, 2);
        cruzeiro.setJogador(atacante);
        float pontuacaoEsperada = (float) 7.8; 
        
        float pontuacaoRecebida = cruzeiro.calculaScoreTime(atacante, zagueiro);

        assertEquals(pontuacaoEsperada, pontuacaoRecebida);
    }
    
}