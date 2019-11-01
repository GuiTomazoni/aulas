package sabores;

import pizzaria.Pizza;

public class PizzaDeChocolatePA extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de chocolate com borda grossa");
		System.out.println("adicionando chocolate derretido");
		System.out.println("Adicionando granulado");
	}

	@Override
	public String getSabor() {
		return "Pizza de chocolate da franquia de Porto Alegre";
	}

	public void cozinhar() {
		System.out.println("Assando por 25min à 300 graus");
	}
	
	public void cortar() {
		System.out.println("Cortando em fatias diagonais");
	}
	
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}

}
