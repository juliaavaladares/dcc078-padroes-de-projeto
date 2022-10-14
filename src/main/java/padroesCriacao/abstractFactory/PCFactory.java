package main.java.padroesCriacao.abstractFactory;

public class PCFactory implements ComputadorAbstractFactory{
    @Override
	public Computador criaComputador() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}

	private String RAM;
	private String HDD;
	private String CPU;

	public PCFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
}
