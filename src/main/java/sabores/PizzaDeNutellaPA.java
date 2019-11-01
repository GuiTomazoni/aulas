package sabores;

import pizzaria.Pizza;

public class PizzaDeNutellaPA extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Nutella com borda grossa");
		System.out.println("adicionando nutella");
		System.out.println("adicionando raspas de chocolate");
	}

	@Override
	public String getSabor() {
		return "Pizza de nutella da franquia de Porto Alegre";
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
