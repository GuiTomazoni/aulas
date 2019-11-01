package sabores;

import pizzaria.Pizza;

public class PizzaDeBaconPA extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Bacon com borda fina");
		System.out.println("adicionando fatias de Bacon");
		System.out.println("Adicionando queijo");
		System.out.println("Adicionando molho apimentado");
	}

	@Override
	public String getSabor() {
		return "Pizza de Bacon da franquia de Porto Alegre";
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
