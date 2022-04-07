package basico;

public class TryCatch {

    void erro() {
        String nome = null;
        if (nome == null) {
            System.out.println("Nulo! \n");
            // throw new NullPointerException("ou ou, Objeto nulo identificado!");
            throw new ObjNulo("Errouuuu");
        }
        nome.toLowerCase();
    }

    public static void main(String[] args) {
        // TryCatch tryCatch = new TryCatch();
        // tryCatch.erro();
        try {
            new Conta().sacar(-10);
        } catch (ObjNulo e) {
            System.out.println("Tratando o erro de objeto nulo ou valor negativo");
        }
    }
}

class Conta {
    double saldo = 200;

    void sacar(double valor) throws ObjNulo {
        saldo -= valor;
        System.out.println("Saldo:" + saldo);
        if (valor <= -1) {
            throw new ObjNulo("Pan pan pan pan");
        }
    }
}

class ObjNulo extends NullPointerException {
    ObjNulo(String txt) {
        super(txt);
    }
}