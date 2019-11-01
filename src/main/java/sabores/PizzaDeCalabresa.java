package sabores;

import pizzaria.Pizza;

public class PizzaDeCalabresa extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de calabresa");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando calabresa");
	}

	@Override
	public String getSabor() {
		return "Calabresa";
	}

}
