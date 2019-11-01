package pizzaria;

public class App {

public static void main(String[] args) {
	FactoryDePizzaSimples factory = new FactoryDePizzaSimples();
	Pizzaria pizzaria = new Pizzaria(factory);
	
	Pizza pizzaDeQueijo = pizzaria.pedirPizza("queijo");
	System.out.println("Saindo uma pizza de " + pizzaDeQueijo.getSabor());
	
	System.out.println();
	
	Pizza pizzaDeCalabresa = pizzaria.pedirPizza("calabresa");
	System.out.println("Saindo uma pizza de " + pizzaDeCalabresa.getSabor());
}
	
	
}
