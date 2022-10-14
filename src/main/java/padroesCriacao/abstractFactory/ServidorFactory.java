package main.java.padroesCriacao.abstractFactory;

public class ServidorFactory implements ComputadorAbstractFactory {
    @Override
	public Computador criaComputador() {
		return new Servidor(this.RAM, this.HDD, this.CPU);
	}

	private String RAM;
	private String HDD;
	private String CPU;

	public ServidorFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
}
