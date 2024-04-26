package br.com.caze.animal;

public class Cachorro extends Animal {
	
	//Características
	
	private String fucinho;

	//Construtor
	
	public Cachorro(String nome, int idade, String tipo_animal, String fucinho) {
		super(nome, idade, tipo_animal);
		this.fucinho = fucinho;
	}
	
	public String getfucinho() {
		return fucinho;
	}
	
	
	public void setFucinho(String fucinho) {
		this.fucinho = fucinho;
	}
	
	//Ação
	
	public void farejar() {
		System.out.println("Cachorro está farejando...");
	}

	public void fazerSom() {
		super.fazerSom();
		System.out.println("Au Au!");
	}

	public void ExibirInformacoes() {
		super.ExibirInformacoes();
		System.out.println(fucinho);
	}
	
	

}