package basico;

public class Print {

    public static void main(String[] args) {
        System.out.printf("%s", "Helio Franca");
        System.out.format("%n %s %b", "Helio Franca ", false);

        System.out.format("%n %1$s %1$s ", "Helio Franca ", false);

    }

}
