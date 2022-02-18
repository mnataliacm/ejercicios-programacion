package ejercicios.tema09.b_POOenJava.ejercicio12;

public class Libro extends Publicacion implements Prestable{

	private boolean prestado;
	
	public Libro(String isbn, String titulo, int ano) {
		super(isbn, titulo, ano);
	}
	
	@Override
	public void presta() {
		if (this.prestado) {
		System.out.println("Lo siento, el libro ya está prestado.");
		} else {
			this.prestado = true;
		}
	}
	
	@Override
	public void devuelve() {
		this.prestado = false;
	}
	
	@Override
	public String toString() {	
		return super.toString() + "  (" + (this.prestado ? "prestado" : "no prestado") + ")";
	}

	@Override
	public boolean prestado() {

		return this.prestado;
	}

	
}
