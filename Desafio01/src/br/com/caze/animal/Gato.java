package br.com.caze.animal;

public class Gato extends Animal {
	
	private String cor;

	public Gato(String nome, int idade, String tipo_animal, String cor) {
		super(nome, idade, tipo_animal);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void arranhar() {
		System.out.println("O gato está arranhando...");
	}


	public void fazerSom() {
		super.fazerSom();
		System.out.println("Miau!");
	}

	public void ExibirInformacoes() {
		super.ExibirInformacoes();
		System.out.println(cor);
	}
	
	
}