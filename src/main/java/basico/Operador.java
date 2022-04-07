package basico;

public class Operador {

	public static void main(String args[]) {
		int num = 1;

		// Operador Ternário
		System.out.println(num > 0 ? true : false);
		String nome = num > 1 ? "Helio" : "Aline";
		System.out.println(nome);
		num = 2;
		nome = num > 1 ? "Helio" : "Aline";
		System.out.println(nome);

	}

}
