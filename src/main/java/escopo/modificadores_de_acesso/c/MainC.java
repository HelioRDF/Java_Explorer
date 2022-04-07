package escopo.modificadores_de_acesso.c;

import escopo.modificadores_de_acesso.a.Main;

public class MainC extends Main {

    void msg() {
        super.imprimir();
        super.imprimirB();
        // super.imprimirC(); modificador privado
        // super.imprimirD(); só pode ser acessado dentro do pacote
    }

    public static void main(String[] args) {
        MainC c = new MainC();
        c.msg();
    }

}
