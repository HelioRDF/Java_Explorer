package basico;

public class Variavel {

	// byte, short, int long
	// float, double
	// boolean
	// String

	// Vari�vel de inst�ncia ou objeto, atributo da classe .
	private String nome;
	// Vari�vel da classe, estatica ou Global.
	private static boolean verificado = false;

	char meuChar = '\u2764';

	double d = 1d;
	// long l = 177_466_46l; // Pode usar _ para separar os numeros.
	float f = 1f;

	// double dd = l;
	// float ff = l;

	// Base octal
	int a = 010;

	// Base hexadecimal
	int b = 0xe;

	// Base binária
	// int c = 0B100;

	// Notação cientifica
	double d2 = 1.2e3d; // 1.2x(10x10x10) e=elevado na base 10

	// Notação cientifica
	float f2 = 3e2f; // 12x(10x10) e=elevado na base 10

	public Variavel(String nome) {
		this.nome = nome;
		// TODO Auto-generated constructor stub
	}

	public void verificar() {
		// Variável Local metodo Imprimir
		String mensagem = "Nome: ";

		// Cria��o de vari�vel local com mesmo nome da vari�vel global.
		boolean verificado = true;
		Variavel.verificado = verificado;

		System.out.println(mensagem + this.nome + ".\nVerificado = " + Variavel.verificado);
		if (verificado) {

			// Não permite repetir uma várivel local dentro do mesmo bloco
			// boolean verificado=true;
			// Vari�vel local do If.
			String novaMensagem = "Variável local do If";
			System.out.println(novaMensagem);
		}
	}

	public static void main(String[] args) {
		// Variavel objeto = new Variavel("Helio Franca");
		// objeto.verificar();

		// System.out.println("a= "+objeto.a+" b="+objeto.b);
		// System.out.println("d2= "+objeto.d2);
		// System.out.println("f2= "+objeto.f2);
		// System.out.println("l= "+objeto.l);
		// System.out.println("c= "+objeto.c);
		// System.out.println("meuChar= "+objeto.meuChar);

		// divisão por 0
		// double i = 1/0; não pode
		double i = 1 / 0.0; // retorna infinity

		System.out.println("a" == "v");

		PessoaA p = new PessoaA();
		p.nome = "Helio";

		PessoaA p2 = p;

		p.nome = "Aline";

		String a = "a";
		String b = a;
		a += "aa";

		System.out.println(p.nome);
		System.out.println(p2.nome);
		p.imprimir("xxx");
	}
}

class PessoaA {
	String nome;

	public PessoaA() {
		// TODO Auto-generated constructor stub
	}

	void imprimir(String nome) {
		this.nome = nome;
		System.out.println(this.nome);
	}
}