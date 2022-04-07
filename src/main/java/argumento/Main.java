package argumento;

public class Main {

	public static void main(String[] args) {
		Executar e = new Executar();
		e.imprimir("Helio","Aline");
	}
}

class Executar {
	String id;
	public void imprimir(String... nomes) {
		System.out.println("Total: " + nomes.length);
	}
}