package jana60;

public class Quadrato implements Poligono {

	// Parametri base
	private int lato;

	// Costruttore
	public Quadrato(int lato) throws Exception {
		super();
		this.lato = lato;
		this.validalato();
	}

	// Metodi
	public void validalato() throws Exception {
		if (lato < 0) {
			throw new Exception("Il lato non può essere negativo!");
		}
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return lato * 2;
	}

	// Creo il to string per stampare tutte le caratteristiche
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Il tuo Quadrato di lato " + lato + ", ha come perimetro: " + calcolaPerimetro() + ", ed ha aerea: "
				+ calcolaArea() + ". Ma che bel quadrato!";
	}

}
