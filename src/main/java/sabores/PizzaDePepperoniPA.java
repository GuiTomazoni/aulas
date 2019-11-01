package sabores;

import pizzaria.Pizza;

public class PizzaDePepperoniPA extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Pepperoni com borda grossa");
		System.out.println("Adicionando fatias de Pepperoni");
		System.out.println("Adicionando orégano");
		System.out.println("Adicionando molho picante");
	}

	@Override
	public String getSabor() {
		return "Pizza de Pepperoni da franquia de Porto Alegre";
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
