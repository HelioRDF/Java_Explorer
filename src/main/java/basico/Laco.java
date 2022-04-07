package basico;

public class Laco {

	static void imprimir() {
		System.out.println("Teste");
	}

	public static void main(String[] args) {

		meuFor: for (int i = 1; true; i += 2) {
			break meuFor;
		}

		meuWhile: while (true) {
			break meuWhile;
		}

		// do
		// System.out.println("xxx");
		// while(1>1);
		//
		// do {
		//
		// System.out.println("xxx2");
		// }
		// while(1>1);

		// ArrayList<String> nomes = new ArrayList<String>();
		// nomes.add("Helio");
		// nomes.add("Aline");
		// nomes.add("Teté");
		// for(String n:nomes) {
		//
		// }

		// System.out.println(nomes);

		// for (int i = 5; i > 0; i--, imprimir()) {
		//
		// }

		// for(int j=1,l=2;j>l;j--,l--) {
		//
		// }

		// for(;;) {
		//
		// }

	}
}
