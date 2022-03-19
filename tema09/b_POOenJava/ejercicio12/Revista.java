package tema09.b_POOenJava.ejercicio12;

public class Revista extends Publicacion{
	
	private int numero;

	public Revista(String isbn, String titulo, int ano, int numero) {
		super(isbn, titulo, ano);
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ISBN: " + getIsbn() + ", título: " + getTitulo() + ", año de publicación: " + getAno() + ", Nº: " + numero;
	}
	
	

}
