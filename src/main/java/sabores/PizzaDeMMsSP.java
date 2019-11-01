package sabores;

import pizzaria.Pizza;

public class PizzaDeMMsSP extends Pizza {
	
	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de MMs com borda fina");
		System.out.println("adicionando chocolate meio amargo");
		System.out.println("Adicionando MMs");
	}

	@Override
	public String getSabor() {
		return "Pizza de MMs da franquia de São Paulo";
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
