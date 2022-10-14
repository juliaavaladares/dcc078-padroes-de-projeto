package main.java.padroesCriacao.abstractFactory;

public class Laptop implements Computador {

	@Override
	public String getRAM() {
		System.out.println("Memoria RAM Laptop");
		return null;
	}

	@Override
	public String getHDD() {
		System.out.println("Memoria HDD Laptop");
		return null;
	}

	@Override
	public String getCPU() {
		System.out.println("Memoria CPU Laptop");
		return null;
	}

}
