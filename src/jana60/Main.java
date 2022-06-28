package jana60;

public class Main {

	public static void main(String[] args) {

		try {

			// Test Quadrato
			System.out.println("Ecco il tuo quadrato!");
			Quadrato quadrato = new Quadrato(5);
			System.out.println(quadrato.toString());

			// Test Rettangolo
			System.out.println("Ecco il tuo quadrato!");
			Rettangolo rettangolo = new Rettangolo(5, 7);
			System.out.println(rettangolo.toString());

			// Test Quadrato rotto
			// System.out.println("Ecco il tuo quadrato!");
			// Quadrato quadrato2 = new Quadrato(-5);
			// System.out.println(quadrato2.toString());

			// Test Quadrato rotto
			System.out.println("Ecco il tuo quadrato!");
			Rettangolo rettangolo2 = new Rettangolo(-5, -7);
			System.out.println(rettangolo2.toString());

		} catch (Exception e) {
			System.out.println("Hai sbagliato ad immettere i dati: ");
			System.out.println(e.getMessage());
		}

	}

}
