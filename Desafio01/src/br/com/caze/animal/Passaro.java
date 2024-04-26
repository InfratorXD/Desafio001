package br.com.caze.animal;

public class Passaro extends Animal {
	
	private String bico;

	public Passaro(String nome, int idade, String tipo_animal, String bico) {
		super(nome, idade, tipo_animal);
		this.bico = bico;
	}

	public String getBico() {
		return bico;
	}

	public void setBico(String bico) {
		this.bico = bico;
	}
	
	public void voar() {
		System.out.println("Pássaro está voando");
	}

}
