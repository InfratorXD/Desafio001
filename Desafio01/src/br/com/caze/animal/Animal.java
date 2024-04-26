package br.com.caze.animal;

public class Animal {
	
	//Características
	
	private String nome;
	private int idade;
	private String tipo_animal;
	
	//Construtor
	
	public Animal(String nome, int idade, String tipo_animal) {
		this.nome = nome;
		this.idade = idade;
		this.tipo_animal = tipo_animal;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//Ação (método)
	
	
	public void cadastrar() {
		System.out.println("Animal cadastrado com sucesso!");
	}
	
	public void consulta() {
		System.out.println("Consulta do animal agendada!");
	}

	public void idade() {
		System.out.println("Tenho " + idade + " anos, e me chamo " + nome );
	}
	
	public void nome() {
		System.out.println("Meu nome animal é " + nome);
	}

	public void fazerSom() {
		System.out.print("Animal fazendo som ");
	}
	
	public void ExibirInformacoes() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(tipo_animal);
	}
}
