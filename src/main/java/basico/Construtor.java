package basico;

class Construtor {
    String nome;

    Construtor() {
        System.out.println("Construtor vazio!");

    }

    Construtor(String nome) {
        this();// Chama o construtor vazio!
        this.nome = nome;
        System.out.println("Construtor com argumento String: " + nome);
    }

    Construtor(int idade) {
        this("Nome");// Chama o construtor com string!
        System.out.println("Construtor com argumento int: " + idade);
    }

    void imprimir() {
        System.out.println("Imprimiu");
    }
}

class user {
    public static void main(String[] args) {
        Construtor c = new Construtor(33);
        c.imprimir();

    }
}