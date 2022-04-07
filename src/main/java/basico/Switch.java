package basico;

public class Switch {

	public static void main(String[] args) {
		String txt = "a";
		switch (txt) {
			case "a":
				System.out.println("a");
				break;

			case "b":
				System.out.println("b");
				break;

			case "c":
				System.out.println("c");
				break;

			case "Helio":
				System.out.println("d");
				break;

			default:
				System.out.println("default...");
		}
	}

}
