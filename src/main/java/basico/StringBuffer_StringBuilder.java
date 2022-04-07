package basico;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		criar();
		//performaceConcatenacao();

	}

	public static void criar() {
		String str1 = "Olá";
		String str2 = str1;
		str1="mundo";
		StringBuffer buffer = new StringBuffer("Buffer Teste");
		StringBuilder builder = new StringBuilder("Builder teste");

		buffer.append(" 001");
		builder.append("002");

		
		
		System.out.println(str2+" "+str1);
		System.out.println(buffer.reverse());
		System.out.println(builder);
	}

	public static void performaceConcatenacao() {
		/* https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865
		 * ########################################### INICIO BLOCO CONCATENAÇÃO COM
		 * OPERADOR '+' ###########################################
		 */
		String strFinal = "";
		long tStart = System.currentTimeMillis();
		/*
		 * Vamos concatenar 100000 vezes o caractere 'a', então entenda que cada vez que
		 * passarmos no laço a JVM irá criar um novo objeto em memória.
		 */
		for (int i = 0; i < 100000; i++) {
			strFinal += "a";
		}

		long tEnd = System.currentTimeMillis();
		long tResult = tEnd - tStart;
		System.out.println("Tempo de Execução com operador'+' = " + tResult + " ms");

		/*
		 * ########################################### FIM BLOCO CONCATENAÇÃO COM
		 * OPERADOR '+' ###########################################
		 */

		/*
		 * ########################################### INICIO BLOCO CONCATENAÇÃO COM
		 * StringBuilder ###########################################
		 */
		StringBuilder strBuilder = new StringBuilder();
		tStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuilder.append("a");
		}
		tEnd = System.currentTimeMillis();
		tResult = tEnd - tStart;
		System.out.println("Tempo de Execução com StringBuilder= " + tResult + " ms");

		/*
		 * ########################################### INICIO BLOCO CONCATENAÇÃO COM
		 * StringBuilder ###########################################
		 */
		StringBuffer strBuffer = new StringBuffer();
		tStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuffer.append("a");
		}
		tEnd = System.currentTimeMillis();
		tResult = tEnd - tStart;
		System.out.println("Tempo de Execução com StringBuffer= " + tResult + " ms");
	}

}
