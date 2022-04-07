
/**
 * Não pode ser acessada por classes que estão em pacotes
 * @author Franca
 *
 */
public class A {
	String valor = "Classe A";

	public A(String valor) {
		
		this.valor = valor;
	}
	
	void imprimir() {
		System.out.println(this.valor);
	}
}
