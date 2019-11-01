package pizzaria;

public class PizzaDeMMs extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de MMs");
		System.out.println("Preparando a massa");
		System.out.println("Adicionando MMs");
	}

	@Override
	public String getSabor() {
		return "MMs";
	}

}
