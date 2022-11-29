package main.java.padroesEstruturais.proxy;

public interface Pagamento{
    String pagaProduto(float valorProduto, String senhaCartao);
    float consultaLimite();
}