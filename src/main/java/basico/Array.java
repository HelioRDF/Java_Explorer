package basico;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String args[]) {
		int num[] = { 1, 2, 3, 4, 5, 6 };
		int[] num2;
		num2 = new int[] { 7, 8, 9 };

		for (int n : num) {
			System.out.println(n);
		}

		System.out.println("\n");
		for (int n : num2) {
			System.out.println(n);
		}

		ArrayList<String> txt = new ArrayList<String>();

		txt.add("Helio");
		txt.add(new String("Aline"));
		txt.add(new String("Teté"));
		System.out.println("\n" + txt.size());
		System.out.println("\n 0: " + txt.get(0));
		txt.set(0, "Helio Franca");
		System.out.println("\n 0: " + txt.get(0));

		
		Iterator<String> it = txt.iterator();
		while (it.hasNext()) {
			String valor = it.next();
			System.out.println("\n-> "+valor);

		}

		String lista[][][][][][][] = new String[2][2][2][2][2][2][2];
		lista[0][0][0][0][0][0][0] = "Texto";
		lista[0][0][0][0][0][0][1] = "Texto";

		System.out.println("\n"+lista[0][0][0][0][0][0][1]);
	}

}
