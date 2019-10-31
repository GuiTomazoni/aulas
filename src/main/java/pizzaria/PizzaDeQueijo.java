package pizzaria;

public class PizzaDeQueijo extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de queijo");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando queijo");
	}

	@Override
	public String getSabor() {
		return "queijo";
	}

}
