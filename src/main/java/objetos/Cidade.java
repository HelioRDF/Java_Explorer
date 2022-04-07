package objetos;

public class Cidade {
	String nome;
	int cod;

	public Cidade(String nome, int cod) {
		this.nome = nome;
		this.cod = cod;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCod() {
		return this.cod;
	}

}
