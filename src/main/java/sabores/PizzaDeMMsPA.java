package sabores;

import pizzaria.Pizza;

public class PizzaDeMMsPA extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de MMs com borda grossa");
		System.out.println("adicionando chocolate derretido");
		System.out.println("Adicionando MMs");
	}

	@Override
	public String getSabor() {
		return "Pizza de MMs da franquia de Porto Alegre";
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
