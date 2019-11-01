package pizzaria;

public class PizzaDeNutella extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Nutella");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando Nutella");
	}

	@Override
	public String getSabor() {
		return "Nutella";
	}

}
