package main.java.padroesCriacao.abstractFactory;

public class ComputadorFactory  {

    public static Computador criaComputador(ComputadorAbstractFactory caf) {
		return caf.criaComputador();
	}

}
