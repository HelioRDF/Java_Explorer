package basico;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Pessoa> pessoa = Arrays.asList(
                new Pessoa("Helio Franca", 32),
                new Pessoa("Aline Franca", 29),
                new Pessoa("Tete Franca", 9));
    }
}

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
}
