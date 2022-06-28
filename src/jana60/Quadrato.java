package jana60;

public class Quadrato implements Poligono {

	// Parametri base
	private int lato;

	// Costruttore
	public Quadrato(int lato) {
		super();
		this.lato = lato;
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

}
