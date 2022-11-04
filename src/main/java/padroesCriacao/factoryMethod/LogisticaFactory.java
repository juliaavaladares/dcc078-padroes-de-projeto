package main.java.padroesCriacao.factoryMethod;

public class LogisticaFactory{
    public static ILogistica obterLogistica(String tipoLogistica){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.java.padroesCriacao.factoryMethod.Logistica" + tipoLogistica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Logistica inexistente");
        }
        if (!(objeto instanceof ILogistica)) {
            throw new IllegalArgumentException("Logistica inválida");
        }

        return (ILogistica) objeto;

    }
}
