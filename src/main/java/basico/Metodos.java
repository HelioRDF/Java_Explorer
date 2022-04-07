package basico;

public class Metodos {

	public static void main(String[] args) {
		Humano p = new Cachorro();
		System.out.println(p.getId());
	}

	// Metodo sincronizado
	synchronized String imprimir() {
		return "";
	}
	
	//Sobrecarga de metodo
	String imprimir(String msg) {
		return "msg";
	}
}

class Humano {
	static int id = 1000;
	static int getId() {
		return id;
	}
}

class Cachorro extends Humano {
	static int getId() {
		return 999;
	}
}