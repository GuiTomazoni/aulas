package sabores;

import pizzaria.Pizza;

public class PizzaDeBacon extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Bacon");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando Bacon");
	}

	@Override
	public String getSabor() {
		return "Bacon";
	}

}
