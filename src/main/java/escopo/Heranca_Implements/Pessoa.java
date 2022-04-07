package escopo.Heranca_Implements;

abstract class Pessoa {
    int id;

    abstract void validarId();

    void imprimir() {
        System.out.println("Olá Pessoa!");
    }

    public static void imprimirB() {
        System.out.println("Olá Pessoa B!");
    }

    void imprimirC() {
        System.out.println("Olá Pessoa C!");
    }
}
