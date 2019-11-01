package sabores;

import pizzaria.Pizza;

public class PizzaDeChocolate extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Chocolate");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando Chocolate");
	}

	@Override
	public String getSabor() {
		return "Chocolate";
	}

}
