package basico;

public class CompararStrings {
	
	public static void main(String[] args) {
		String a=new String("Teste");//Cria uma nova referência, não inclui no pool
		String b=new String("x");//Cria uma nova referência, não inclui no pool
		String c="Teste"; //Cria uma variável no pool, ou busca no pool uma string com o mesmo valor
		String d="Teste"; //Cria uma variável no pool, ou busca no pool uma string com o mesmo valor
		String e="Teste"; //Cria uma variável no pool, ou busca no pool uma string com o mesmo valor
		
		//Compara a referência
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println(c==e);
		System.out.println(d==e);
		
		
		//Compara o valor
		System.out.println("\n"+a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));
	
		
	}

}
