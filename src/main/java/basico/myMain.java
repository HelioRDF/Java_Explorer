package basico;

public class myMain {
	/**Obrigatório que o main seja public, static e void
	 * o argumento pode ser String[] args / String args[] / String ... args
	 *  
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Olá"+ args[0]);
		
		  String variavelDeAmbiente = System.getenv ("JAVA_HOME");
		  String variavelDeSistema = System.getProperty("JAVAA") ;
		  System.out.println(variavelDeAmbiente);
		  System.out.println(variavelDeSistema);
		  
		 
		
	}

}
