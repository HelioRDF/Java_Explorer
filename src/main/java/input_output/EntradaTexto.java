package input_output;

import java.util.Scanner;

public class EntradaTexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digitar:");
		String texto=entrada.nextLine();
		
		System.out.println("Retorno:"+texto);
		
		
	}

}
