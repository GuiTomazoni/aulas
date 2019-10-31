package pizzaria;

public class PizzaDePortuguesa extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de Portuguesa");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando Portuguesa");
	}

	@Override
	public String getSabor() {
		return "Portuguesa";
	}

}
