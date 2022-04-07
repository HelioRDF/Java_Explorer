package basico;

public class OperadorLogico {

	public static void main(String[] args) {
		boolean r1 = 1 == 2 & imprimir("Validar & r1"); // Sempre valida a segunda expressão
		boolean r2 = 1 <= 2 && imprimir("Validar && com true r2"); // Só valida a segunda se a primeira for true
		boolean r3 = 3 <= 2 && imprimir("Validar && com false r3"); // Só valida a segunda se a primeira for true
		
		boolean r4 = 3 <= 2 | imprimir("Validar | com false r4"); // Sempre valida a segunda expressão
		boolean r5 = 3 <= 5 || imprimir("Validar || com true r5"); // Só valida a segunda se a primeira for false
		
		boolean r6 = 3 <= 5 ^ 3>=5 ; // Valida se um é false
		
		
		
		System.out.println("r6: "+r6);

		
	}
	static boolean imprimir(String msg) {
		System.out.println(msg);
		return true;
	}
}
