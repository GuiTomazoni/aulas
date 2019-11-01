package sabores;

import pizzaria.Pizza;

public class PizzaDeCalabresaSP extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Calabresa com borda fina");
		System.out.println("Adicionando fatias de calabresa");
		System.out.println("Adicionando or�gano");
		System.out.println("Adicionando molho suave");
	}

	@Override
	public String getSabor() {
		return "Pizza de Calabresa da franquia de S�o Paulo";
	}
	
	public void cozinhar() {
		System.out.println("Assando por 20min � 250 graus");
	}
	
	public void cortar() {
		System.out.println("Cortando em fatias quadradas");
	}
	
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}

	
}
