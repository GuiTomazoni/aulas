package pizzaria;

public class Pizzaria {

	public Pizza pedirPizza(String sabor) {
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
		default:
			break;
		}
		
		pizza.preparar();
		pizza.cozinhar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
}
