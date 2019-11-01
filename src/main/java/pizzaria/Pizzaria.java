package pizzaria;

public abstract class Pizzaria {
	
	public Pizza pedirPizza(String sabor) {
		Pizza pizza = criarPizza(sabor);
		
		pizza.preparar();
		pizza.cozinhar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
	abstract Pizza criarPizza(String sabor);
}
