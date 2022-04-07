package escopo.modificadores_de_acesso.b;

import escopo.modificadores_de_acesso.a.Main;

abstract class MainB {
    public abstract void txt();

    public static void main(String[] args) {
        Main main = new Main();
        main.imprimir();
        // main.imprimirB();
    }

}
