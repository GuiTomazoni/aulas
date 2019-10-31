package pizzaria;

public abstract class Pizza {

	public abstract void preparar();
	
	public void cozinhar() {
		System.out.println("assando por 25min à 350 graus");
	}
	
	public void cortar() {
		System.out.println("Cortando em fatias diagonais");
	}
	
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}
	
	public abstract String getSabor();
}
