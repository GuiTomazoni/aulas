package pizzaria;

import sabores.PizzaDeBacon;
import sabores.PizzaDeCalabresa;
import sabores.PizzaDeChocolate;
import sabores.PizzaDeMMs;
import sabores.PizzaDeNutella;
import sabores.PizzaDePepperoni;
import sabores.PizzaDePortuguesa;
import sabores.PizzaDeQueijo;

public class FactoryDePizzaSimples {

	public Pizza criarPizza(String sabor) {
		Pizza pizza = null;

		switch (sabor) {

		case "queijo":
			pizza = new PizzaDeQueijo();
			break;
		case "calabresa":
			pizza = new PizzaDeCalabresa();
			break;
		case "pepperoni":
			pizza = new PizzaDePepperoni();
			break;
		case "portuguesa":
			pizza = new PizzaDePortuguesa();
		case "bacon":
			pizza = new PizzaDeBacon();
		case "chocolate":
			pizza = new PizzaDeChocolate();
		case "MMs":
			pizza = new PizzaDeMMs();
		case "nutella":
			pizza = new PizzaDeNutella();
		}
		return pizza;
	}
}
