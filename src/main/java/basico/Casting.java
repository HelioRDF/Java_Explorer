package basico;

public class Casting {
    public static void main(String[] args) {
        Object obj = new Object();
        obj = "Helio";
        String nome = (String) obj;
        System.out.println(nome);
    }

}
