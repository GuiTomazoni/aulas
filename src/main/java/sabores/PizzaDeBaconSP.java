package sabores;

import pizzaria.Pizza;

public class PizzaDeBaconSP extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Bacon com borda grossa");
		System.out.println("adicionando fatias de Bacon");
		System.out.println("Adicionando queijo");
		System.out.println("Adicionando molho suave");
	}

	@Override
	public String getSabor() {
		return "Pizza de Bacon da franquia de São Paulo";
	}

	public void cozinhar() {
		System.out.println("Assando por 20min à 250 graus");
	}
	
	public void cortar() {
		System.out.println("Cortando em fatias quadradas");
	}
	
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}
}
