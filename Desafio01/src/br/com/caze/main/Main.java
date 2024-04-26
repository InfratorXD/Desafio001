package br.com.caze.main;

import br.com.caze.animal.Cachorro;
import br.com.caze.animal.Gato;
import br.com.caze.animal.Passaro;


public class Main {

	public static void main(String[] args) {
	
		
		Cachorro ShihTzu = new Cachorro("Kira",3,"bebezinha","Pequeno");
		Gato Persa = new Gato("Faisca",2,"macho","MIAAAU");
		Passaro Pombo = new Passaro ("Pombo",5,"animal de rua","pontudo");

		ShihTzu.farejar();
		Persa.arranhar();
		ShihTzu.fazerSom();
		Persa.fazerSom();
		Persa.idade();
		ShihTzu.idade();
		Pombo.voar();
		Pombo.idade();
	}

}