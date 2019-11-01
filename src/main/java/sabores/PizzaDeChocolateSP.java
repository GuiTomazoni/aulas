package sabores;

import pizzaria.Pizza;

public class PizzaDeChocolateSP extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de chocolate com borda fina");
		System.out.println("adicionando chocolate derretido meio amargo");
		System.out.println("Adicionando chocolate ao leite");
	}

	@Override
	public String getSabor() {
		return "Pizza de chocolate da franquia de S�o Paulo";
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
