package basico;

public interface Interface {
	String ESTADO="BRASIL";
}

//Uma interface pode ter variáveis e metodos, ambos puplicos por padrão
//Uma classe e uma interface não podem ter o mesmo nome.
interface D {
	// a variável é publica, static e final por padrão
	String MENSAGEM = "Olá";
	// O método é public e abstract por padrão.
	void imprimir(String texto);

}