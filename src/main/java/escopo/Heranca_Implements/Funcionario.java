package escopo.Heranca_Implements;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionario extends Pessoa {

	String nome;
	int idade;
	
	Funcionario() {
	
	}

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	Logger logger = Logger.getLogger(Funcionario.class.getName());
	// log messages using log(Level level, String msg)

	@Override
	void validarId() {
		System.out.println("Consultar sistema de validação");
	}


	void imprimir() {
		System.out.println("Olá Funcionario!");
	}

	public static void imprimirB() {
		System.out.println("Olá Funcionario B!");
	}

	void imprimirD() {
		System.out.println("Olá Funcionario D!");
		logger.log(Level.INFO, "This is message 1");
		logger.log(Level.WARNING, "This is message 2");
	}

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		// Método não estatico o bind ocorre em tempo de execução, no caso new
		// Funcionario();
		funcionario.imprimir();
		funcionario.imprimirD();
		funcionario.imprimirC();
		funcionario.id = 1;

		Pessoa funcionarioB = new Funcionario();
		// Método estatico o bind ocorre em tempo de compilação, no caso Pessoa;
		funcionarioB.imprimirB();
		funcionarioB.imprimir();
		funcionarioB.imprimirC();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}