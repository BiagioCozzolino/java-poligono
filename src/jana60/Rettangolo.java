package jana60;

public class Rettangolo implements Poligono {

	// Attributi
	private int base;
	private int altezza;

	// Costruttore
	public Rettangolo(int base, int altezza) throws Exception {
		super();
		this.base = base;
		this.altezza = altezza;
		this.validadati();
	}

	// Metodi
	public void validadati() throws Exception {
		if (base < 0 || altezza < 0) {
			throw new Exception("I valori non possono essere negativi!");
		}
	}

	@Override
	public double calcolaPerimetro() {
		return (base * 2) + (altezza * 2);
	}

	@Override
	public double calcolaArea() {
		return base * altezza;
	}

	// Creo il to string per stampare tutte le caratteristiche
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Il tuo Rettangolo di base " + base + " e di altezza: " + altezza + ", ha come perimetro: "
				+ calcolaPerimetro() + ", ed ha aerea: " + calcolaArea() + ". Ma che bel rettangolo!";
	}
}
