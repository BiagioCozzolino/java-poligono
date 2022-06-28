package jana60;

public class Rettangolo implements Poligono {

	// Attributi
	private int base;
	private int altezza;

	// Costruttore
	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return (base * 2) + (altezza * 2);
	}

	@Override
	public double calcolaArea() {
		return base * altezza;
	}

}
