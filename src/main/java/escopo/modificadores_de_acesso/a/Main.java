package escopo.modificadores_de_acesso.a;

public class Main {

    public void imprimir() {
        System.out.println("Main A");
    }

    protected void imprimirB() {
        System.out.println("Main A-B");
    }

    private void imprimirC() {
        System.out.println("Main A-C");
    }

    void imprimirD() {
        System.out.println("Main A-D");
    }

    public static void main(String[] args) {
        // Main.imprimirC();
    }

}
