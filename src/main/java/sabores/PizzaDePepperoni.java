package sabores;

import pizzaria.Pizza;

public class PizzaDePepperoni extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de pepperoni");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando pepperoni");
	}

	@Override
	public String getSabor() {
		return "pepperoni";
	}

}
